package com.borisruzanov.russianwives.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0016\u001a\u00020\nH\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006!"}, d2 = {"Lcom/borisruzanov/russianwives/di/module/AppModule;", "", "app", "Lcom/borisruzanov/russianwives/App;", "(Lcom/borisruzanov/russianwives/App;)V", "getApp", "()Lcom/borisruzanov/russianwives/App;", "filterRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/filter/FilterRepository;", "prefs", "Lcom/borisruzanov/russianwives/mvp/model/data/prefs/Prefs;", "provideApp", "provideChatMessageRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/chatmessage/ChatMessageRepository;", "provideChatsRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/chats/ChatsRepository;", "provideCoinsRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/coins/CoinsRepository;", "provideFriendProfileRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/friend/FriendRepository;", "provideHotUsersRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/hots/HotUsersRepository;", "providePrefsClass", "provideRatingRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/rating/RatingRepository;", "provideSearchRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/search/SearchRepository;", "provideSliderRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/slider/SliderRepository;", "provideSystemRepository", "Lcom/borisruzanov/russianwives/mvp/model/data/SystemRepository;", "provideUserRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final com.borisruzanov.russianwives.App app = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.App provideApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository provideRatingRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.chatmessage.ChatMessageRepository provideChatMessageRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.friend.FriendRepository provideFriendProfileRepository(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.chats.ChatsRepository provideChatsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs providePrefsClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.filter.FilterRepository filterRepository(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.search.SearchRepository provideSearchRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.slider.SliderRepository provideSliderRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.coins.CoinsRepository provideCoinsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.repository.hots.HotUsersRepository provideHotUsersRepository(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.borisruzanov.russianwives.mvp.model.data.SystemRepository provideSystemRepository(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.App getApp() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.App app) {
        super();
    }
}