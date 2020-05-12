package com.borisruzanov.russianwives.utils;


import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.borisruzanov.russianwives.utils.Consts.FREE_USER_TRIGGER_TIME;
import static com.borisruzanov.russianwives.utils.FirebaseUtils.isUserExist;

/**
 * Includes all logic according subscription features manipulation
 */
public class SubscriptionManager {
    private Prefs mPrefs;
    private DatabaseReference mRealtimeReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser mFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


    public SubscriptionManager(Prefs mPrefs) {
        this.mPrefs = mPrefs;
    }

    /**
     * Free plan enable all basic features
     */
    public void setFreePlan() {
        //Setting values of the features to the status enabled/disabled from config depends on plan
        if (isUserExist()) {
            setPlanInDatabase(Consts.FREE);
            mPrefs.setValue(Consts.OPEN_USER, mPrefs.getValue(Consts.CONFIG_FREE_OPEN_USER));
            mPrefs.setValue(Consts.SHOW_FRIEND_INFO, mPrefs.getValue(Consts.CONFIG_FREE_SHOW_FRIEND_INFO));
        }
    }

    /**
     * Free closed plan disable all basic features
     */
    public void setFreeClosedPlan() {
        //Setting values of the features to the status enabled/disabled from config depends on plan
        if (isUserExist()) {
            setPlanInDatabase(Consts.FREE_CLOSED);
            mPrefs.setValue(Consts.OPEN_USER, mPrefs.getValue(Consts.CONFIG_FREE_OPEN_USER_CLOSED));
            mPrefs.setValue(Consts.SHOW_FRIEND_INFO, mPrefs.getValue(Consts.CONFIG_FREE_SHOW_FRIEND_INFO_CLOSED));
            switchOpenToClosePlan();
        }
    }

    /**
     * Updating date when user open all free features
     */
    private void switchOpenToClosePlan() {
        //Getting the date which adds hours to current time . Hours getting from config FREE_TRIGGER_ADDED_HOURS
        //Saving new date in realtime
        try {
            //First time setting trigger time value
            //If value in realtime not exist or default value
            if (mPrefs.getValue(Consts.FREE_USER_TRIGGER_TIME).equals(Consts.DEFAULT) || mPrefs.getValue(Consts.FREE_USER_TRIGGER_TIME) == null){
                //Saving new date in realtime
                mRealtimeReference.child(Consts.USERS_DB).child(mFirebaseUser.getUid()).child(FREE_USER_TRIGGER_TIME).setValue(Timer.getInstance().getDateAfterTrigger(mPrefs));
                //Saving new date in prefs
                mPrefs.setValue(FREE_USER_TRIGGER_TIME, Timer.getInstance().getDateAfterTrigger(mPrefs));
            } else {
                //If value in realtime exist
                Date triggerTime = simpleDateFormat.parse(mPrefs.getValue(Consts.FREE_USER_TRIGGER_TIME));
                Date currentTime = Calendar.getInstance().getTime();
                if (triggerTime.before(currentTime)) {
                    mRealtimeReference.child(Consts.USERS_DB).child(mFirebaseUser.getUid()).child(FREE_USER_TRIGGER_TIME).setValue(Timer.getInstance().getDateAfterTrigger(mPrefs));
                    //Saving new date in prefs
                    mPrefs.setValue(FREE_USER_TRIGGER_TIME, Timer.getInstance().getDateAfterTrigger(mPrefs));
                    setFreePlan();
                    ActionsCounter.getInstance().resetCounters(mPrefs);
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setPremiumPlan() {
        //Setting values of the features to the status enabled/disabled from config depends on plan
        if (isUserExist()) {
            setPlanInDatabase(Consts.PREMIUM);
            mPrefs.setValue(Consts.OPEN_USER, mPrefs.getValue(Consts.CONFIG_PREMIUM_OPEN_USER));
            mPrefs.setValue(Consts.SHOW_FRIEND_INFO, mPrefs.getValue(Consts.CONFIG_PREMIUM_SHOW_FRIEND_INFO));
        }
    }

    public void setPremiumTrialPlan() {
        //Setting values of the features to the status enabled/disabled from config depends on plan
        if (isUserExist()) {
            setPlanInDatabase(Consts.PREMIUM_TRIAL);
            mPrefs.setValue(Consts.OPEN_USER, mPrefs.getValue(Consts.CONFIG_PREMIUM_TRIAL_OPEN_USER));
            mPrefs.setValue(Consts.SHOW_FRIEND_INFO, mPrefs.getValue(Consts.CONFIG_PREMIUM_TRIAL_SHOW_FRIEND_INFO));
        }
    }

    public void setVipPlan() {
        //Setting values of the features to the status enabled/disabled from config depends on plan
        if (isUserExist()) {
            setPlanInDatabase(Consts.VIP);
            mPrefs.setValue(Consts.OPEN_USER, mPrefs.getValue(Consts.CONFIG_VIP_OPEN_USER));
            mPrefs.setValue(Consts.SHOW_FRIEND_INFO, mPrefs.getValue(Consts.CONFIG_VIP_SHOW_FRIEND_INFO));
        }
    }


    private void setVipTrialPlan() {
        //Setting values of the features to the status enabled/disabled from config depends on plan
        if (isUserExist()) {
            setPlanInDatabase(Consts.VIP_TRIAL);
            mPrefs.setValue(Consts.OPEN_USER, mPrefs.getValue(Consts.CONFIG_VIP_TRIAL_OPEN_USER));
            mPrefs.setValue(Consts.SHOW_FRIEND_INFO, mPrefs.getValue(Consts.CONFIG_VIP_TRIAL_SHOW_FRIEND_INFO));
        }
    }

    /**
     * Getting plan of the user
     *
     * @return - plan type
     */
    public String getPlanType() {
        if (isUserExist()) {
            return mPrefs.getValue(Consts.SUBSCRIPTION);
        } else {
            return Consts.DEFAULT;
        }
    }

    /**
     * Updates user's plan in realtime and preferences
     */
    private void setPlanInDatabase(String type) {
        mPrefs.setValue(Consts.SUBSCRIPTION, type);
        mRealtimeReference.child(Consts.USERS_DB).child(mFirebaseUser.getUid()).child(Consts.SUBSCRIPTION).setValue(type);
    }

    /**
     * Checking what plan has user and set needed functionality
     */
    public void setCurrentUserPlan() {
        String currentPlan = mPrefs.getValue(Consts.SUBSCRIPTION);
        if (currentPlan.equals(Consts.FREE)) {
            setFreePlan();
        } else if (currentPlan.equals(Consts.FREE_CLOSED)) {
            setFreeClosedPlan();
        } else if (currentPlan.equals(Consts.PREMIUM_TRIAL)) {
            setPremiumTrialPlan();
        } else if (currentPlan.equals(Consts.VIP_TRIAL)) {
            setVipTrialPlan();
        } else if (currentPlan.equals(Consts.PREMIUM)) {
            setPremiumPlan();
        } else if (currentPlan.equals(Consts.VIP)) {
            setVipPlan();
        } else {
            setPremiumTrialPlan();
        }
    }

    /**
     * Checking if feature is available for existing user plan
     */
    public String getFeatureStatus(String type) {
        String result = Consts.DISABLED;
        switch (type) {
            case Consts.OPEN_USER:
                result = getStatus(Consts.OPEN_USER);
            case Consts.SHOW_FRIEND_INFO:
                result = getStatus(Consts.SHOW_FRIEND_INFO);
        }

        return result;
    }

    private String getStatus(String featureType) {
        if (mPrefs.getValue(featureType).equals(Consts.ENABLED)) {
            return Consts.ENABLED;
        } else {
            return Consts.DISABLED;
        }
    }

}
