package com.borisruzanov.russianwives

import android.app.Application
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ProcessLifecycleOwner
import android.content.Context
import android.util.Log
import com.borisruzanov.russianwives.di.component.AppComponent
import com.borisruzanov.russianwives.di.component.DaggerAppComponent
import com.borisruzanov.russianwives.di.module.AppModule
import com.borisruzanov.russianwives.mvp.model.data.SystemRepository
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs
import com.borisruzanov.russianwives.utils.ActionsCounter
import com.borisruzanov.russianwives.utils.Consts
import com.borisruzanov.russianwives.utils.Consts.COUNTER_ACTIONS
import com.borisruzanov.russianwives.utils.FirebaseUtils.isUserExist
import com.borisruzanov.russianwives.utils.SubscriptionManager
import com.google.android.gms.analytics.GoogleAnalytics
import com.google.android.gms.analytics.HitBuilders
import com.google.android.gms.analytics.Tracker
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.squareup.picasso.OkHttpDownloader
import com.squareup.picasso.Picasso


class App : Application(), LifecycleObserver {

    private var mUserDatabase: DatabaseReference? = null
    private var mAuth: FirebaseAuth? = null
    private lateinit var sAnalytics: GoogleAnalytics
    lateinit var sTracker: Tracker
    private lateinit var mSystemRepository: SystemRepository
    private lateinit var mPrefs: Prefs
    private lateinit var mSubscriptionManager: SubscriptionManager


    val component: AppComponent by lazy {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    object AnalyticsTracker {
        lateinit var sTracker: Tracker
        private lateinit var sAnalytics: GoogleAnalytics

        fun onCreate(context: Context) {
            sAnalytics = GoogleAnalytics.getInstance(context)
            sTracker = sAnalytics.newTracker(context.getString(R.string.tracker_id))
            sTracker.enableExceptionReporting(true)
            sTracker.enableAdvertisingIdCollection(true)
            sTracker.enableAutoActivityTracking(true)
            sTracker.send(HitBuilders.ScreenViewBuilder().setCustomDimension(1, null).build())
        }
    }


    override fun onCreate() {
        super.onCreate()
        component.inject(this)
        AnalyticsTracker.onCreate(this)
        mAuth = FirebaseAuth.getInstance()
        mPrefs = Prefs(this)
        mSubscriptionManager = SubscriptionManager(mPrefs)
        if (mAuth!!.currentUser != null) {
            onlineStatusUsersTable()
            getUserCounter()
        }

        //todo: provide picasso by dagger
        val builder = Picasso.Builder(this)
        builder.downloader(OkHttpDownloader(this, Integer.MAX_VALUE.toLong()))
        val built = builder.build()
        built.setIndicatorsEnabled(true)
        built.isLoggingEnabled = true
        Picasso.setSingletonInstance(built)

        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    /**
     * Getting User's counter value from realtime and put it in shared preferences when user LOG IN
     */
    private fun getUserCounter() {
        if( isUserExist()){
            mUserDatabase = FirebaseDatabase.getInstance().reference
                    .child("Users").child(mAuth!!.currentUser!!.uid).child(COUNTER_ACTIONS)
            mUserDatabase!!.addValueEventListener(object : ValueEventListener {
                override fun onCancelled(p0: DatabaseError) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.value == null){
                        mUserDatabase!!.setValue("0")
                    } else{
                        mPrefs.setValue(COUNTER_ACTIONS, snapshot.value.toString())
                    }
                }
            })
        }
    }


    /**
     * Setting online / offline status to the user in Users table
     */
    private fun onlineStatusUsersTable() {
        //Disconnect user and save last entrance in DB
        mUserDatabase = FirebaseDatabase.getInstance().reference
                .child(Consts.USERS_DB).child(mAuth!!.currentUser!!.uid).child("online")
        mUserDatabase!!.setValue(Consts.TRUE)
        mUserDatabase!!.onDisconnect().setValue(ServerValue.TIMESTAMP)
    }

    /**
     * Gets the default [Tracker] for this [Application].
     * @return tracker
     */
    @Synchronized
    fun getTracker(): Tracker = GoogleAnalytics.getInstance(this).newTracker(R.xml.global_tracker)

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resumed() {
        //When go online updating preferences from Realtime
        ActionsCounter.getInstance().updatePreferencesUserCounter(mPrefs)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun paused() {
        //When go offline updating Realtime from Preferences
        ActionsCounter.getInstance().updateRealtimeUserCounter(mPrefs)
        mPrefs.setValue(Consts.GET_USER_INFO_FLAG, Consts.DISABLED )
    }
}
