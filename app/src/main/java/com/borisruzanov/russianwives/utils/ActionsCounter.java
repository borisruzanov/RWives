package com.borisruzanov.russianwives.utils;

import android.support.annotation.NonNull;

import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.borisruzanov.russianwives.utils.FirebaseUtils.checkIsUserAuthorised;

public class ActionsCounter {


    private static ActionsCounter instance = null;
    private DatabaseReference realtimeReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
    private SubscriptionManager mSubscriptionManager;

    private ActionsCounter() {
    }

    public static ActionsCounter getInstance() {
        if (instance == null)
            instance = new ActionsCounter();
        return instance;
    }

    /**
     * Create new counter for new user
     */
    public void createNewCounter(Prefs prefs) {
        if (checkIsUserAuthorised()) {
            if (prefs.getValue(Consts.COUNTER_ACTIONS).equals(Consts.DEFAULT)) {
                prefs.setValue(Consts.COUNTER_ACTIONS, "0");
            }
        }
    }

    /**
     * Increment local actions counter
     */
    public void addOneActionInPreferences(Prefs prefs) {
        //If user is authorised
        if (checkIsUserAuthorised()) {
            //If counter in PREFERENCES not default
            if (!prefs.getValue(Consts.COUNTER_ACTIONS).equals(Consts.DEFAULT)) {
                incrementCounter(prefs);

                mSubscriptionManager = new SubscriptionManager(prefs);
                int localCounter = Integer.parseInt(prefs.getValue(Consts.COUNTER_ACTIONS));
                int configCounter = Integer.parseInt(prefs.getValue(Consts.COUNTER_ACTIONS_CONFIG));
                //If local counter is more that config means User used app more than can switch to FREE plan or pay PREMIUM
                if (localCounter >= configCounter) {

                    //If user on PREMIUM TRIAL check for counter to show dialog of choose the plan
                    if (mSubscriptionManager.getPlanType().equals(Consts.PREMIUM_TRIAL)) {
                        checkIfPremiumTrialIsOver(prefs);
                    }

                    //If user on FREE OPEN plan check if we need to switch to FREE CLOSED
                    if (mSubscriptionManager.getPlanType().equals(Consts.FREE)) {
                        checkFreeOpenStatus();
                    }
                }

            } else if (prefs.getValue(Consts.COUNTER_ACTIONS).equals(Consts.DEFAULT)) {
                //If for some reason in preferences not COUNTER_ACTIONS field set it to 0
                prefs.setValue(Consts.COUNTER_ACTIONS, "0");
            }
        }
    }

    /**
     * Increment local counter value by one
     */
    private void incrementCounter(Prefs prefs) {
        int counter = Integer.parseInt(prefs.getValue(Consts.COUNTER_ACTIONS));
        counter++;
        prefs.setValue(Consts.COUNTER_ACTIONS, String.valueOf(counter));
        realtimeReference.child(Consts.USERS_DB).child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child(Consts.COUNTER_ACTIONS).setValue(prefs.getValue(Consts.COUNTER_ACTIONS));
    }

    /**
     * Checking if need to switch from free open to free close
     */
    public void checkFreeOpenStatus() {
        if (checkIsUserAuthorised()) {
            //If local counter is more that config means User used app more than can switch to FREE plan or pay PREMIUM
            mSubscriptionManager.setFreeClosedPlan();
        }
    }

    /**
     * Enable premium flag to show subscription dialog
     *
     * @param prefs
     */
    private void checkIfPremiumTrialIsOver(Prefs prefs) {
        //If local counter is more that config means User used app more than can switch to FREE plan or pay PREMIUM
            prefs.setValue(Consts.PREMIUM_TRIAL_END_FLAG, Consts.ENABLED);
            //Resetting counter to start over for free close / open plans
            resetCounters(prefs);
    }

    /**
     * Update value in Realtime from preferences when go logout or offline
     */
    public void updateRealtimeUserCounter(Prefs prefs) {
        if (checkIsUserAuthorised()) {
            realtimeReference.child(Consts.USERS_DB).child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child(Consts.COUNTER_ACTIONS).setValue(prefs.getValue(Consts.COUNTER_ACTIONS));
        }
    }

    /**
     * Update value in Preferences from Realtime when go login or online
     */
    public void updatePreferencesUserCounter(Prefs prefs) {
        if (checkIsUserAuthorised()) {
            //If user exist getting counter value from realtime
            realtimeReference.child(Consts.USERS_DB).child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child(Consts.COUNTER_ACTIONS).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists() && dataSnapshot.getValue() != null) {
                        //If value exist and not null save it in preferences
                        prefs.setValue(Consts.COUNTER_ACTIONS, dataSnapshot.getValue().toString());
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        }
    }


    /**
     * Set realtime counter value and preferences counter value to zero
     * usage 1 - when premium trial is over
     */
    public void resetCounters(Prefs prefs) {
        if (checkIsUserAuthorised()) {
            realtimeReference.child(Consts.USERS_DB).child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child(Consts.COUNTER_ACTIONS).setValue("0");
            prefs.setValue(Consts.COUNTER_ACTIONS, "0");
        }
    }

}

