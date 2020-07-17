package com.borisruzanov.russianwives.mvp.ui.myprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/myprofile/MyProfilePresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/myprofile/MyProfileView;", "interactor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/myprofile/MyProfileInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/myprofile/MyProfileInteractor;)V", "mUid", "", "mVideoURI", "userDescriptionList", "Ljava/util/ArrayList;", "Lcom/borisruzanov/russianwives/models/UserDescriptionModel;", "getVideoUri", "onFirstViewAttach", "", "registerSubscribers", "setActionsCount", "setAllCurrentUserInfo", "setUserHideStatus", "callback", "Lcom/borisruzanov/russianwives/utils/UserHideCallback;", "unsubscribe", "updateActionsCount", "event", "Lcom/borisruzanov/russianwives/eventbus/VisitsEvent;", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class MyProfilePresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileView> {
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.UserDescriptionModel> userDescriptionList = null;
    private java.lang.String mUid;
    private java.lang.String mVideoURI;
    private final com.borisruzanov.russianwives.mvp.model.interactor.myprofile.MyProfileInteractor interactor = null;
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    public final void setAllCurrentUserInfo() {
    }
    
    private final void setActionsCount() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void updateActionsCount(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.eventbus.VisitsEvent event) {
    }
    
    public final void registerSubscribers() {
    }
    
    public final void unsubscribe() {
    }
    
    /**
     * * calling a changeUserHideStatus method of MyProfileInteractor
     *     * @param callback a callback after successfully change hideStatus
     */
    public final void setUserHideStatus(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.UserHideCallback callback) {
    }
    
    /**
     * *
     *     * get Video URL of user Video
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVideoUri() {
        return null;
    }
    
    @javax.inject.Inject()
    public MyProfilePresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.myprofile.MyProfileInteractor interactor) {
        super();
    }
}