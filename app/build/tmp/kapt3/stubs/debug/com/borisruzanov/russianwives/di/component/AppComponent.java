package com.borisruzanov.russianwives.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&\u00a8\u0006\u001c"}, d2 = {"Lcom/borisruzanov/russianwives/di/component/AppComponent;", "", "inject", "", "app", "Lcom/borisruzanov/russianwives/App;", "actionsFragment", "Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsFragment;", "chatMessageActivity", "Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessageActivity;", "chatsFragment", "Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsFragment;", "filterDialogFragment", "Lcom/borisruzanov/russianwives/mvp/ui/filter/FilterDialogFragment;", "friendProfileActivity", "Lcom/borisruzanov/russianwives/mvp/ui/friendprofile/FriendProfileActivity;", "mainActivity", "Lcom/borisruzanov/russianwives/mvp/ui/main/MainActivity;", "mustInfoDialogFragment", "Lcom/borisruzanov/russianwives/mvp/ui/mustinfo/MustInfoDialogFragment;", "myProfileActivity", "Lcom/borisruzanov/russianwives/mvp/ui/myprofile/MyProfileActivity;", "onlineUsersFragment", "Lcom/borisruzanov/russianwives/mvp/ui/onlineUsers/OnlineUsersFragment;", "rewardVideoActivity", "Lcom/borisruzanov/russianwives/mvp/ui/rewardvideo/RewardVideoActivity;", "searchFragment", "Lcom/borisruzanov/russianwives/mvp/ui/search/SearchFragment;", "app_debug"})
@dagger.Component(modules = {com.borisruzanov.russianwives.di.module.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.App app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.main.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.actions.ActionsFragment actionsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity chatMessageActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity friendProfileActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment chatsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment filterDialogFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity myProfileActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.search.SearchFragment searchFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.onlineUsers.OnlineUsersFragment onlineUsersFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment mustInfoDialogFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoActivity rewardVideoActivity);
}