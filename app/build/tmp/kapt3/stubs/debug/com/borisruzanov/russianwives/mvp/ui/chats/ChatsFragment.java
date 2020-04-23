package com.borisruzanov.russianwives.mvp.ui.chats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J \u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0016J\b\u00101\u001a\u00020\u000bH\u0007J\b\u00102\u001a\u00020!H\u0016J\u0016\u00103\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00067"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsFragment;", "Lcom/arellomobile/mvp/MvpAppCompatFragment;", "Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsView;", "()V", "chatsAdapter", "Lcom/borisruzanov/russianwives/mvp/ui/chats/adapter/ChatsAdapter;", "getChatsAdapter", "()Lcom/borisruzanov/russianwives/mvp/ui/chats/adapter/ChatsAdapter;", "setChatsAdapter", "(Lcom/borisruzanov/russianwives/mvp/ui/chats/adapter/ChatsAdapter;)V", "chatsPresenter", "Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsPresenter;", "getChatsPresenter", "()Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsPresenter;", "setChatsPresenter", "(Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsPresenter;)V", "emptyLayout", "Landroid/widget/RelativeLayout;", "getEmptyLayout", "()Landroid/widget/RelativeLayout;", "setEmptyLayout", "(Landroid/widget/RelativeLayout;)V", "mMainView", "Landroid/view/View;", "onItemClickCallback", "Lcom/borisruzanov/russianwives/OnItemClickListener$OnItemClickCallback;", "recyclerChatsList", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerChatsList", "()Landroid/support/v7/widget/RecyclerView;", "setRecyclerChatsList", "(Landroid/support/v7/widget/RecyclerView;)V", "highlightChats", "", "messageSeen", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "openChat", "uid", "", "name", "image", "provideChatsPresenter", "showErrorMessage", "showUserChats", "userChats", "", "Lcom/borisruzanov/russianwives/models/UserChat;", "app_debug"})
public final class ChatsFragment extends com.arellomobile.mvp.MvpAppCompatFragment implements com.borisruzanov.russianwives.mvp.ui.chats.ChatsView {
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.RecyclerView recyclerChatsList;
    @org.jetbrains.annotations.NotNull()
    public com.borisruzanov.russianwives.mvp.ui.chats.adapter.ChatsAdapter chatsAdapter;
    @org.jetbrains.annotations.NotNull()
    public android.widget.RelativeLayout emptyLayout;
    private android.view.View mMainView;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    @javax.inject.Inject()
    public com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter chatsPresenter;
    private final com.borisruzanov.russianwives.OnItemClickListener.OnItemClickCallback onItemClickCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getRecyclerChatsList() {
        return null;
    }
    
    public final void setRecyclerChatsList(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.mvp.ui.chats.adapter.ChatsAdapter getChatsAdapter() {
        return null;
    }
    
    public final void setChatsAdapter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.chats.adapter.ChatsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getEmptyLayout() {
        return null;
    }
    
    public final void setEmptyLayout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter getChatsPresenter() {
        return null;
    }
    
    public final void setChatsPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter provideChatsPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * * Getting the list of user's chats and set it to adapter or show empty text
     *     * @param userChats
     */
    @java.lang.Override()
    public void showUserChats(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.borisruzanov.russianwives.models.UserChat> userChats) {
    }
    
    @java.lang.Override()
    public void highlightChats(boolean messageSeen) {
    }
    
    @java.lang.Override()
    public void showErrorMessage() {
    }
    
    /**
     * * Open clicked chat
     *     * @param uid
     *     * @param name
     *     * @param image
     */
    @java.lang.Override()
    public void openChat(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String image) {
    }
    
    public ChatsFragment() {
        super();
    }
}