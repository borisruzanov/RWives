package com.borisruzanov.russianwives.mvp.ui.chatmessage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0002J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0002J\"\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u00020-H\u0016J\u0012\u00108\u001a\u00020-2\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020-H\u0002J\b\u0010@\u001a\u00020%H\u0007J\b\u0010A\u001a\u00020-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessageActivity;", "Lcom/arellomobile/mvp/MvpAppCompatActivity;", "Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessageView;", "()V", "APP_ID", "", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "itemPos", "", "mActionsBlockLinear", "Landroid/widget/LinearLayout;", "mAdView", "Lcom/google/android/gms/ads/AdView;", "mAdapter", "Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/adapter/ChatMessageAdapter;", "mChatMessageView", "Landroid/widget/EditText;", "mChatUser", "mCurrentPage", "mCurrentUserId", "mLastKey", "mLastSeenView", "Landroid/widget/TextView;", "mLinearLayout", "Landroid/support/v7/widget/LinearLayoutManager;", "mPrefs", "Lcom/borisruzanov/russianwives/mvp/model/data/prefs/Prefs;", "mPrevKey", "mRefreshLayout", "Landroid/support/v4/widget/SwipeRefreshLayout;", "mRootRef", "Lcom/google/firebase/database/DatabaseReference;", "messageList", "Ljava/util/ArrayList;", "Lcom/borisruzanov/russianwives/models/Message;", "presenter", "Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessagePresenter;", "getPresenter", "()Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessagePresenter;", "setPresenter", "(Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessagePresenter;)V", "removedItem", "sp", "adInit", "", "addFile", "increaseUserActivity", "loadMessages", "loadMoreMessages", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "phrasePrepare", "provideChatMessagePresenter", "setEmptyMessage", "Companion", "app_debug"})
public final class ChatMessageActivity extends com.arellomobile.mvp.MvpAppCompatActivity implements com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageView {
    private final java.lang.String APP_ID = "ca-app-pub-5095813023957397~1146672660";
    private com.google.android.gms.ads.AdView mAdView;
    private java.lang.String mChatUser;
    private android.widget.TextView mLastSeenView;
    private android.widget.EditText mChatMessageView;
    private android.support.v4.widget.SwipeRefreshLayout mRefreshLayout;
    private android.widget.LinearLayout mActionsBlockLinear;
    private com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics;
    private java.lang.String sp;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    @javax.inject.Inject()
    public com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter presenter;
    private final com.google.firebase.database.DatabaseReference mRootRef = null;
    private java.lang.String mCurrentUserId;
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.Message> messageList = null;
    private com.borisruzanov.russianwives.mvp.ui.chatmessage.adapter.ChatMessageAdapter mAdapter;
    private android.support.v7.widget.LinearLayoutManager mLinearLayout;
    private int mCurrentPage;
    private int itemPos;
    private java.lang.String mLastKey;
    private java.lang.String mPrevKey;
    private com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs mPrefs;
    private java.lang.String removedItem;
    private static final int TOTAL_ITEMS_TO_LOAD = 20;
    private static final int GALLERY_PICK = 1;
    public static final com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter provideChatMessagePresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * Increasing level of the activity of the user
     */
    private final void increaseUserActivity() {
    }
    
    /**
     * * If message comes from friendActivity it send immid to friend from user
     */
    private final void phrasePrepare() {
    }
    
    private final void adInit() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void setEmptyMessage() {
    }
    
    private final void addFile() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * * Loading messages after swiping 2+ times
     */
    private final void loadMoreMessages() {
    }
    
    /**
     * * Load messages only once
     */
    private final void loadMessages() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public ChatMessageActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessageActivity$Companion;", "", "()V", "GALLERY_PICK", "", "TOTAL_ITEMS_TO_LOAD", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}