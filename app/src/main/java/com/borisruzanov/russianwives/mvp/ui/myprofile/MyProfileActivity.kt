package com.borisruzanov.russianwives.mvp.ui.myprofile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.*
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.*
import butterknife.BindView
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.borisruzanov.russianwives.OnItemClickListener
import com.borisruzanov.russianwives.R
import com.borisruzanov.russianwives.di.component
import com.borisruzanov.russianwives.models.UserDescriptionModel
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs
import com.borisruzanov.russianwives.mvp.ui.global.adapter.UserDescriptionListAdapter
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity
import com.borisruzanov.russianwives.mvp.ui.profilesettings.ProfileSettingsActivity
import com.borisruzanov.russianwives.mvp.ui.search.SearchFragment
import com.borisruzanov.russianwives.mvp.ui.video.VideoRecordingActivity
import com.borisruzanov.russianwives.utils.Consts
import com.borisruzanov.russianwives.utils.UserHideCallback
import com.bumptech.glide.Glide
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import javax.inject.Inject

class MyProfileActivity : MvpAppCompatActivity(), MyProfileView, UserHideCallback {

    private val APP_ID = "ca-app-pub-5095813023957397~1146672660"
    private var mAdView: AdView? = null

    //todo: use kotlin syntetic
    //UI
    @BindView(R.id.recycler_list_userDescription)
    lateinit var recyclerView: RecyclerView
    lateinit var toolbar: Toolbar
    private lateinit var fab: FloatingActionButton
    private lateinit var nameText: TextView
    private lateinit var ageText: TextView
    private lateinit var countryText: TextView
    private lateinit var numberOfLikes: TextView
    private lateinit var numberOfVisits: TextView
    private lateinit var imageView: ImageView
    private var mPrefs: Prefs? = null

    lateinit var userDescriptionListAdapter: UserDescriptionListAdapter

    //Objects for video features
    private lateinit var mVideoView:VideoView
    private lateinit var mPhotoicon:AppCompatImageButton
    private lateinit var mVideoicon:AppCompatImageButton
    private lateinit var mVideoFrameLayout: FrameLayout
    private lateinit var mPlayimage :AppCompatImageView
    private lateinit var mVideoErrorLinearLayout: LinearLayout
    private lateinit var mVideoUpload:AppCompatButton
    private lateinit var mVideoProgress:ProgressBar

    @Inject
    @InjectPresenter
    lateinit var presenter: MyProfilePresenter

    @Inject
    @ProvidePresenter
    fun provideMyProfilePresenter() = presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        presenter.registerSubscribers()
        //UI
        toolbar = findViewById(R.id.toolbar)
        toolbar.title = ""
        mPrefs = Prefs(this)

        val collapsingToolbarLayout = findViewById<View>(R.id.collapsing_toolbar_layout) as CollapsingToolbarLayout
        collapsingToolbarLayout.isTitleEnabled = false

        setSupportActionBar(toolbar)
        //mToolbar.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        //mToolbar.background.alpha = 125
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recycler_list_userDescription)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        userDescriptionListAdapter = UserDescriptionListAdapter(setOnItemClickCallback(), this)
        recyclerView.adapter = userDescriptionListAdapter

        fab = findViewById(R.id.fab_id)
        fab.setOnClickListener {
            val settingsProfile = Intent(this@MyProfileActivity, ProfileSettingsActivity::class.java)
            startActivity(settingsProfile)
            finish()
        }

        //to change hideStatus
        fab.setOnLongClickListener {
            presenter.setUserHideStatus(this)
            return@setOnLongClickListener true
        }
        imageView = findViewById(R.id.my_profile_image)
        nameText = findViewById(R.id.my_profile_tv_name)
        ageText = findViewById(R.id.my_profile_tv_age)
        countryText = findViewById(R.id.my_profile_tv_country)
        numberOfLikes = findViewById(R.id.number_of_likes)
        numberOfVisits = findViewById(R.id.number_of_visits)
        mVideoFrameLayout=findViewById(R.id.my_profile_video_frameLayout)
        mVideoView=findViewById(R.id.my_profile_videoview)
        mPlayimage=findViewById(R.id.my_profile_videoplay_button)
        mPhotoicon=findViewById(R.id.my_profile_photobutton)
        mVideoicon=findViewById(R.id.my_profile_videobutton)
        mVideoErrorLinearLayout=findViewById(R.id.my_profile_videonot_found_linear)
        mVideoUpload=findViewById(R.id.my_profile_video_upload_button)
        mVideoProgress=findViewById(R.id.my_profile_video_pgbar)
        supportFragmentManager.beginTransaction().add(R.id.my_profile_list_container, SearchFragment()).commit()
        setListener()
        increaseUserActivity()
        adInit()
    }

    private fun adInit() {
        MobileAds.initialize(this, APP_ID)
        mAdView = findViewById<View>(R.id.adView) as AdView?
        val adRequest = AdRequest.Builder().build()
        mAdView?.loadAd(adRequest)
    }

    /**
     * Increasing level of the activity of the user
     */
    private fun increaseUserActivity() {
        if (!mPrefs!!.getValue(Consts.USER_ACTIVITY).isEmpty()) {
            if (mPrefs!!.getValue(Consts.USER_ACTIVITY) != Consts.DEFAULT) {
                var prefsValue = Integer.valueOf(mPrefs!!.getValue(Consts.USER_ACTIVITY))
                prefsValue++
                mPrefs!!.setValue(Consts.USER_ACTIVITY, prefsValue.toString())
            } else { //Set user activity to zero if he dont have one
                mPrefs!!.setValue(Consts.USER_ACTIVITY, "0")
            }
        }
    }

    override fun setUserData(name: String?, age: String?, country: String?, image: String?, videoURL: String?) {
        nameText.text = name
        ageText.text = age
        countryText.text = country
        if (image != Consts.DEFAULT) {
            Glide.with(this)
                    .load(image)
                    .into(imageView)
        }
        if(!videoURL.isNullOrEmpty()){
            mVideoFrameLayout.visibility=View.VISIBLE
            mVideoView.visibility=View.VISIBLE
            mVideoView.setVideoURI(Uri.parse(videoURL))
            mVideoProgress.visibility=View.VISIBLE
            mVideoView.setOnPreparedListener{
                it.isLooping=true
                mVideoProgress.visibility=View.GONE
                mPlayimage.visibility=View.VISIBLE
            }
            Log.d("MyProfileDebug", "Video url is:-$videoURL")
            imageView.visibility=View.INVISIBLE
        }else{
            imageView.visibility=View.VISIBLE
            Toast.makeText(applicationContext,"No video found",Toast.LENGTH_SHORT).show()
        }
    }

    override fun setActionsCount(visits: Long, likes: Long) {
        numberOfVisits.text = visits.toString()
        numberOfLikes.text = likes.toString()
    }

    override fun setList(userDescriptionList: List<UserDescriptionModel>) {
        //Setting data to the adapter
        userDescriptionListAdapter.setData(userDescriptionList)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setOnItemClickCallback(): OnItemClickListener.OnItemClickCallback {
        return OnItemClickListener.OnItemClickCallback { view, position -> }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainScreenActivity::class.java)
        startActivity(intent)
    }

    override fun onStop() {
        super.onStop()
        presenter.unsubscribe()
        if (mVideoView.isPlaying) mVideoView.stopPlayback()
    }

    /**
     * a callback after user hide status changed
     */
    override fun hideStatusChangeCall(success: Boolean) {
        if(success)
        {
            Toast.makeText(applicationContext,"Your Account is hide",Toast.LENGTH_LONG).show()
            val intent=Intent(this@MyProfileActivity,MainScreenActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(intent)
            finish()
        }
    }

    /***
     * set listner on mPlayimage,mPhotoicon,mVideoicon,mVideoupload button
     */
     private fun setListener(){
         mPlayimage.setOnClickListener {
                if (mVideoView.isPlaying) {
                    mVideoView.pause()
                    mPlayimage.visibility = View.VISIBLE
                    Log.d("MyProfileDbug","Video Pause")
                } else {
                    mVideoView.start()
                    mPlayimage.visibility=View.INVISIBLE
                    Log.d("MyProfileDebug","Video Play")
                    /*if (!presenter.getVideoUri().isNullOrEmpty()) {
                        mVideoView.setVideoURI(Uri.parse(presenter.getVideoUri()))
                        mVideoView.setOnPreparedListener(MediaPlayer.OnPreparedListener { mp -> mp.isLooping = true })
                        mVideoView.start()
                        mPlayimage.visibility = View.INVISIBLE
                        Log.d("MyProfileDebug", "Video uri is:-" + presenter.getVideoUri())
                    } else {
                        Log.d("MyProfileDebug", "Video uri is:-Empty")
                        Toast.makeText(applicationContext, "Video is not Available", Toast.LENGTH_LONG).show()
                    }*/
                }
        }

         mPhotoicon.setOnClickListener {
            if (mVideoView.isPlaying) mVideoView.stopPlayback()
             mVideoFrameLayout.visibility=View.GONE
             mVideoView.visibility=View.GONE
             mPlayimage.visibility=View.GONE
             mVideoErrorLinearLayout.visibility=View.GONE
             imageView.visibility=View.VISIBLE
             //Toast.makeText(applicationContext,"photo icon click",Toast.LENGTH_LONG).show()
         }

         mVideoicon.setOnClickListener {
             if (!presenter.getVideoUri().isNullOrEmpty()){
                 mVideoFrameLayout.visibility=View.VISIBLE
                 mVideoView.visibility=View.VISIBLE
                 mVideoView.setVideoURI(Uri.parse(presenter.getVideoUri()))
                 mVideoProgress.visibility=View.VISIBLE
                 mVideoView.setOnPreparedListener{
                     it.isLooping=true
                     mPlayimage.visibility=View.VISIBLE
                     mVideoProgress.visibility=View.GONE
                 }
                 imageView.visibility=View.INVISIBLE
                 Log.d("MyProfileDebug","Video url is:-"+presenter.getVideoUri()+" ready to play")
             }else{
                 mVideoFrameLayout.visibility=View.VISIBLE
                 mVideoView.visibility=View.GONE
                 mPlayimage.visibility=View.GONE
                 mVideoErrorLinearLayout.visibility=View.VISIBLE
                 imageView.visibility=View.INVISIBLE
                 Log.d("MyProfileDebug","Video url is Empty")
             }
         }

         mVideoUpload.setOnClickListener {
             startActivity(Intent(this,VideoRecordingActivity::class.java))
             finish()
         }

     }


}
