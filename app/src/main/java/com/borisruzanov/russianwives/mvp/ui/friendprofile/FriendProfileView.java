package com.borisruzanov.russianwives.mvp.ui.friendprofile;

import com.arellomobile.mvp.MvpView;
import com.borisruzanov.russianwives.models.UserDescriptionModel;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

public interface FriendProfileView  extends MvpView{

    //Nullable annotation is used on last parameter friendVideoUrl to indicate that value can be null.
    void setFriendData(String name, String age, String country, String image, @Nullable String friendVideoUrl);
    void setList(List<UserDescriptionModel> userDescriptionList);
    void openRegDialog();
    void setLikeHighlighted();
    void openChatMessage(String name, String image);
    void showMustInfoDialog();
    void openSlider(ArrayList<String> sliderList);
}
