package com.borisruzanov.russianwives.mvp.ui.myprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\nH\u0002J\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/myprofile/MyProfilePresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/myprofile/MyProfileView;", "interactor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/myprofile/MyProfileInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/myprofile/MyProfileInteractor;)V", "userDescriptionList", "Ljava/util/ArrayList;", "Lcom/borisruzanov/russianwives/models/UserDescriptionModel;", "onFirstViewAttach", "", "registerSubscribers", "setActionsCount", "setAllCurrentUserInfo", "unsubscribe", "updateActionsCount", "event", "Lcom/borisruzanov/russianwives/eventbus/VisitsEvent;", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class MyProfilePresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileView> {
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.UserDescriptionModel> userDescriptionList = null;
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
    
    @javax.inject.Inject()
    public MyProfilePresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.myprofile.MyProfileInteractor interactor) {
        super();
    }
}