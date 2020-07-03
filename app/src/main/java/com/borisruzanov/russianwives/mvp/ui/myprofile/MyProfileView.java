package com.borisruzanov.russianwives.mvp.ui.myprofile;

import com.arellomobile.mvp.MvpView;
import com.borisruzanov.russianwives.models.UserDescriptionModel;

import java.util.List;

import javax.annotation.Nullable;

public interface MyProfileView extends MvpView{

    void setUserData(String name, String age, String country, String image,@Nullable String videoURL);
    void setActionsCount(long visits, long likes);
    void setList(List<UserDescriptionModel> userDescriptionList);

}
