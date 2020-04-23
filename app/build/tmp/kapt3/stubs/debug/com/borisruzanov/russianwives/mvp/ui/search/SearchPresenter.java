package com.borisruzanov.russianwives.mvp.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0011J\u001e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fJ\u0016\u0010#\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\'\u001a\u00020\u0015J\u0006\u0010(\u001a\u00020\u0015J\u0006\u0010)\u001a\u00020\u0015J\u0006\u0010*\u001a\u00020\u0015J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0011J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000fJ\u000e\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/search/SearchPresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/search/SearchView;", "searchInteractor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/search/SearchInteractor;", "coinsInteractor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/coins/CoinsInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/search/SearchInteractor;Lcom/borisruzanov/russianwives/mvp/model/interactor/coins/CoinsInteractor;)V", "fsUsers", "Ljava/util/ArrayList;", "Lcom/borisruzanov/russianwives/models/FsUser;", "hotUsers", "Lcom/borisruzanov/russianwives/models/HotUser;", "likedUsers", "Ljava/util/HashSet;", "", "page", "", "usersListCallback", "Lcom/borisruzanov/russianwives/utils/UsersListCallback;", "confirmHotPurchase", "", "getDefaultUserValuesList", "event", "Lcom/borisruzanov/russianwives/eventbus/StringEvent;", "getHotUsers", "getHotUsersByPage", "getUserList", "onUpdate", "openChat", "position", "openChatOnlineUser", "uid", "name", "image", "openFriend", "args", "Landroid/os/Bundle;", "openHotUser", "openSliderWithDefaults", "openSliderWithDefaultsOnlineUsers", "purchaseHot", "registerSubscribers", "setFriendLiked", "setOnlineFriendLiked", "setProgressBar", "isLoading", "", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class SearchPresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.FsUser> fsUsers = null;
    private final java.util.HashSet<java.lang.String> likedUsers = null;
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.HotUser> hotUsers = null;
    private int page;
    private final com.borisruzanov.russianwives.utils.UsersListCallback usersListCallback = null;
    private final com.borisruzanov.russianwives.mvp.model.interactor.search.SearchInteractor searchInteractor = null;
    private final com.borisruzanov.russianwives.mvp.model.interactor.coins.CoinsInteractor coinsInteractor = null;
    
    public final void getUserList(int page) {
    }
    
    public final void getHotUsersByPage() {
    }
    
    /**
     * * Receiving the list of default values of the user fields
     */
    @org.greenrobot.eventbus.Subscribe()
    public final void getDefaultUserValuesList(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.eventbus.StringEvent event) {
    }
    
    public final void openHotUser(int position) {
    }
    
    public final void getHotUsers() {
    }
    
    public final void confirmHotPurchase() {
    }
    
    public final void purchaseHot() {
    }
    
    public final void setProgressBar(boolean isLoading) {
    }
    
    public final void onUpdate() {
    }
    
    public final void openSliderWithDefaults() {
    }
    
    public final void openSliderWithDefaultsOnlineUsers() {
    }
    
    public final void setFriendLiked(int position) {
    }
    
    public final void setOnlineFriendLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    public final void openFriend(int position, @org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
    }
    
    public final void openChat(int position) {
    }
    
    public final void openChatOnlineUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String image) {
    }
    
    public final void registerSubscribers() {
    }
    
    @javax.inject.Inject()
    public SearchPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.search.SearchInteractor searchInteractor, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.coins.CoinsInteractor coinsInteractor) {
        super();
    }
}