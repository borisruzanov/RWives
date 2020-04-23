package com.borisruzanov.russianwives.mvp.ui.friendprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/friendprofile/FriendProfilePresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/friendprofile/FriendProfileView;", "interactor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/friendprofile/FriendProfileInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/friendprofile/FriendProfileInteractor;)V", "userDescriptionList", "Ljava/util/ArrayList;", "Lcom/borisruzanov/russianwives/models/UserDescriptionModel;", "isUserExist", "", "openChatMessage", "", "friendUid", "", "saveUser", "setAllInfo", "setFriendData", "setFriendLiked", "setLikeHighlighted", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class FriendProfilePresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.UserDescriptionModel> userDescriptionList = null;
    private final com.borisruzanov.russianwives.mvp.model.interactor.friendprofile.FriendProfileInteractor interactor = null;
    
    public final void setAllInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void setLikeHighlighted(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final boolean isUserExist() {
        return false;
    }
    
    public final void setFriendLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void saveUser() {
    }
    
    public final void openChatMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    private final void setFriendData(java.lang.String friendUid) {
    }
    
    @javax.inject.Inject()
    public FriendProfilePresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.friendprofile.FriendProfileInteractor interactor) {
        super();
    }
}