package com.borisruzanov.russianwives.utils;

public interface UserHideCallback {

    //a method is call after user hidden status is success or not
    //it is called in MyProfileActivity and UnlockActivity
    void hideStatusChangeCall(boolean success);

}
