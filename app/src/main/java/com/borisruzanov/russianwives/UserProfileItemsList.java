package com.borisruzanov.russianwives;

import android.util.Log;

import com.borisruzanov.russianwives.models.Contract;
import com.borisruzanov.russianwives.models.FsUser;
import com.borisruzanov.russianwives.models.UserDescriptionModel;

import java.util.Arrays;
import java.util.List;

public class UserProfileItemsList {

    public static List<UserDescriptionModel> initData(FsUser fsUser){
        Log.d(Contract.TAG,"Values are -> " + fsUser.getRelationship_status());

        // check hide or not if hide then return if or else
        if (fsUser.isHide()){
            String lockUserText="User is Locked forever";
            return Arrays.asList(new UserDescriptionModel("Gender", lockUserText),
                    new UserDescriptionModel("Relationship Status", lockUserText),
                    new UserDescriptionModel("Body Type", lockUserText),
                    new UserDescriptionModel("Ethnicasdasdity", lockUserText),
                    new UserDescriptionModel("Faith", lockUserText),
                    new UserDescriptionModel("Smoke Status", lockUserText),
                    new UserDescriptionModel("How Often Do You Drink Alcohol", lockUserText),
                    new UserDescriptionModel("Number Of Kids You Have", lockUserText),
                    new UserDescriptionModel("Do You Want Kids", lockUserText),
                    new UserDescriptionModel("Looking for", lockUserText)
            );
        }
        else {
            return Arrays.asList(new UserDescriptionModel("Gender", fsUser.getGender()),
                    new UserDescriptionModel("Relationship Status", fsUser.getRelationship_status()),
                    new UserDescriptionModel("Body Type", fsUser.getBody_type()),
                    new UserDescriptionModel("Ethnicity", fsUser.getEthnicity()),
                    new UserDescriptionModel("Faith", fsUser.getFaith()),
                    new UserDescriptionModel("Smoke Status", fsUser.getSmoking_status()),
                    new UserDescriptionModel("How Often Do You Drink Alcohol", fsUser.getDrink_status()),
                    new UserDescriptionModel("Number Of Kids You Have", fsUser.getNumber_of_kids()),
                    new UserDescriptionModel("Do You Want Kids", fsUser.getWant_children_or_not()),
                    new UserDescriptionModel("Looking for", fsUser.getHobby())
            );
        }
    }
}
