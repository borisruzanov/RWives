package com.borisruzanov.russianwives.mvp.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u00102\u001a\u00020%2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104H\u0016J\u0016\u00106\u001a\u00020%2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0016J\b\u0010:\u001a\u00020%H\u0016J\b\u0010;\u001a\u00020%H\u0016J\u0012\u0010<\u001a\u00020%2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020%H\u0016J\b\u0010@\u001a\u00020%H\u0016J\u0012\u0010A\u001a\u00020%2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001c\u0010B\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J&\u0010G\u001a\u0004\u0018\u00010#2\u0006\u0010E\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010K\u001a\u00020%2\b\u0010L\u001a\u0004\u0018\u00010#2\u0006\u0010M\u001a\u00020$H\u0016J\b\u0010N\u001a\u00020%H\u0016J\u0012\u0010O\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010P\u001a\u00020%H\u0016J\b\u0010Q\u001a\u00020%H\u0016J\b\u0010R\u001a\u00020%H\u0016J \u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020UH\u0016J \u0010X\u001a\u00020%2\u0006\u0010T\u001a\u00020U2\u0006\u0010Y\u001a\u00020U2\u0006\u0010Z\u001a\u00020>H\u0016J\u0010\u0010[\u001a\u00020%2\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010\\\u001a\u00020%H\u0016J\b\u0010]\u001a\u00020%H\u0016J\u0016\u0010^\u001a\u00020%2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020U0`H\u0016J\b\u0010a\u001a\u00020+H\u0007J\b\u0010b\u001a\u00020%H\u0016J\b\u0010c\u001a\u00020%H\u0016J\b\u0010d\u001a\u00020%H\u0016J\b\u0010e\u001a\u00020%H\u0016J\b\u0010f\u001a\u00020%H\u0016J\u0010\u0010g\u001a\u00020%2\u0006\u0010h\u001a\u000201H\u0016J\u0010\u0010i\u001a\u00020%2\u0006\u0010j\u001a\u000201H\u0016J\u0010\u0010k\u001a\u00020%2\u0006\u0010l\u001a\u000201H\u0016J\b\u0010m\u001a\u00020%H\u0016J\b\u0010n\u001a\u00020%H\u0016J\b\u0010o\u001a\u00020%H\u0016J\b\u0010p\u001a\u00020%H\u0016J\b\u0010q\u001a\u00020%H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\'\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006r"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/search/SearchFragment;", "Lcom/arellomobile/mvp/MvpAppCompatFragment;", "Lcom/borisruzanov/russianwives/mvp/ui/search/SearchView;", "Lcom/borisruzanov/russianwives/mvp/ui/confirm/ConfirmDialogFragment$ConfirmListener;", "Lcom/borisruzanov/russianwives/mvp/ui/purchasedialog/PurchaseDialogFragment$ConfirmPurchaseListener;", "Lcom/borisruzanov/russianwives/mvp/ui/hots/HotAdapter$ItemClickListener;", "Lcom/borisruzanov/russianwives/mvp/ui/hots/InfiniteScrollListener$OnLoadMoreListener;", "Lcom/borisruzanov/russianwives/mvp/ui/filter/FilterDialogFragment$FilterListener;", "()V", "adapter", "Lcom/borisruzanov/russianwives/mvp/ui/search/adapter/SearchAdapter;", "dialogFragment", "Lcom/borisruzanov/russianwives/mvp/ui/filter/FilterDialogFragment;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "hotAdapter", "Lcom/borisruzanov/russianwives/mvp/ui/hots/HotAdapter;", "infiniteScrollListener", "Lcom/borisruzanov/russianwives/mvp/ui/hots/InfiniteScrollListener;", "item", "Landroid/view/MenuItem;", "getItem", "()Landroid/view/MenuItem;", "setItem", "(Landroid/view/MenuItem;)V", "layoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "mEmptyListLayout", "Landroid/widget/RelativeLayout;", "onItemChatCallback", "Lkotlin/Function2;", "Landroid/view/View;", "", "", "onItemClickCallback", "onItemLikeCallback", "onUserListScrollListener", "Lcom/borisruzanov/russianwives/mvp/ui/search/adapter/FeedScrollListener;", "searchPresenter", "Lcom/borisruzanov/russianwives/mvp/ui/search/SearchPresenter;", "getSearchPresenter", "()Lcom/borisruzanov/russianwives/mvp/ui/search/SearchPresenter;", "setSearchPresenter", "(Lcom/borisruzanov/russianwives/mvp/ui/search/SearchPresenter;)V", "visible", "", "addHotUsers", "hotUsers", "", "Lcom/borisruzanov/russianwives/models/HotUser;", "addUsers", "userList", "", "Lcom/borisruzanov/russianwives/models/FsUser;", "buySubscription", "clearUsers", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onConfirm", "onConfirmPurchase", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "view", "position", "onLoadMore", "onPrepareOptionsMenu", "onStop", "onUpdate", "onUpdateDialog", "openChat", "uid", "", "name", "image", "openFriend", "transitionName", "args", "openHotUser", "openPurchaseDialog", "openRewardActivity", "openSlider", "sliderList", "Ljava/util/ArrayList;", "providePresenter", "reviewDialogNo", "reviewDialogYes", "sendComplain", "sendToPlayMarket", "setHotsLoaded", "setMenuVisibility", "menuVisible", "setProgressBar", "isLoading", "showEmpty", "show", "showError", "showFullProfileDialog", "showRegistrationDialog", "switchToFreePlan", "userWereNotFoundMsg", "app_debug"})
public final class SearchFragment extends com.arellomobile.mvp.MvpAppCompatFragment implements com.borisruzanov.russianwives.mvp.ui.search.SearchView, com.borisruzanov.russianwives.mvp.ui.confirm.ConfirmDialogFragment.ConfirmListener, com.borisruzanov.russianwives.mvp.ui.purchasedialog.PurchaseDialogFragment.ConfirmPurchaseListener, com.borisruzanov.russianwives.mvp.ui.hots.HotAdapter.ItemClickListener, com.borisruzanov.russianwives.mvp.ui.hots.InfiniteScrollListener.OnLoadMoreListener, com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment.FilterListener {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    @javax.inject.Inject()
    public com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter searchPresenter;
    @org.jetbrains.annotations.Nullable()
    private android.view.MenuItem item;
    private android.widget.RelativeLayout mEmptyListLayout;
    private android.support.v7.widget.GridLayoutManager layoutManager;
    private com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment dialogFragment;
    private com.borisruzanov.russianwives.mvp.ui.hots.InfiniteScrollListener infiniteScrollListener;
    private com.borisruzanov.russianwives.mvp.ui.hots.HotAdapter hotAdapter;
    private final kotlin.jvm.functions.Function2<android.view.View, java.lang.Integer, kotlin.Unit> onItemChatCallback = null;
    private final kotlin.jvm.functions.Function2<android.view.View, java.lang.Integer, kotlin.Unit> onItemLikeCallback = null;
    private final kotlin.jvm.functions.Function2<android.view.View, java.lang.Integer, kotlin.Unit> onItemClickCallback = null;
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics;
    private com.borisruzanov.russianwives.mvp.ui.search.adapter.SearchAdapter adapter;
    private com.borisruzanov.russianwives.mvp.ui.search.adapter.FeedScrollListener onUserListScrollListener;
    private boolean visible;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onUpdateDialog() {
    }
    
    @java.lang.Override()
    public void buySubscription() {
    }
    
    @java.lang.Override()
    public void reviewDialogYes() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter getSearchPresenter() {
        return null;
    }
    
    public final void setSearchPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.MenuItem getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter providePresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    android.view.View view, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.analytics.FirebaseAnalytics getFirebaseAnalytics() {
        return null;
    }
    
    public final void setFirebaseAnalytics(@org.jetbrains.annotations.NotNull()
    com.google.firebase.analytics.FirebaseAnalytics p0) {
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
    
    @java.lang.Override()
    public void setMenuVisibility(boolean menuVisible) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu, @org.jetbrains.annotations.Nullable()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void userWereNotFoundMsg() {
    }
    
    @java.lang.Override()
    public void addUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.borisruzanov.russianwives.models.FsUser> userList) {
    }
    
    @java.lang.Override()
    public void setProgressBar(boolean isLoading) {
    }
    
    @java.lang.Override()
    public void showError() {
    }
    
    @java.lang.Override()
    public void openFriend(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String transitionName, @org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
    }
    
    @java.lang.Override()
    public void openChat(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String image) {
    }
    
    @java.lang.Override()
    public void openHotUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    @java.lang.Override()
    public void showRegistrationDialog() {
    }
    
    @java.lang.Override()
    public void clearUsers() {
    }
    
    @java.lang.Override()
    public void onUpdate() {
    }
    
    @java.lang.Override()
    public void showFullProfileDialog() {
    }
    
    @java.lang.Override()
    public void openSlider(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> sliderList) {
    }
    
    @java.lang.Override()
    public void setHotsLoaded() {
    }
    
    @java.lang.Override()
    public void reviewDialogNo() {
    }
    
    @java.lang.Override()
    public void sendToPlayMarket() {
    }
    
    @java.lang.Override()
    public void switchToFreePlan() {
    }
    
    @java.lang.Override()
    public void sendComplain() {
    }
    
    @java.lang.Override()
    public void onConfirm() {
    }
    
    @java.lang.Override()
    public void onConfirmPurchase() {
    }
    
    @java.lang.Override()
    public void showEmpty(boolean show) {
    }
    
    @java.lang.Override()
    public void onLoadMore() {
    }
    
    @java.lang.Override()
    public void addHotUsers(@org.jetbrains.annotations.Nullable()
    java.util.List<com.borisruzanov.russianwives.models.HotUser> hotUsers) {
    }
    
    @java.lang.Override()
    public void openRewardActivity() {
    }
    
    @java.lang.Override()
    public void openPurchaseDialog() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    public SearchFragment() {
        super();
    }
}