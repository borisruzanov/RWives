package com.borisruzanov.russianwives.mvp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020;H\u0016J\u0006\u0010=\u001a\u00020;J\b\u0010>\u001a\u00020;H\u0002J\u000e\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u000204J\b\u0010A\u001a\u00020;H\u0002J\"\u0010B\u001a\u00020;2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\b\u0010H\u001a\u00020;H\u0016J\b\u0010I\u001a\u00020;H\u0016J\u0012\u0010J\u001a\u00020;2\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\u0010\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u0002042\u0006\u0010Q\u001a\u00020\u0015H\u0016J\u0010\u0010R\u001a\u0002042\u0006\u0010S\u001a\u00020\u0015H\u0016J\u0010\u0010T\u001a\u0002042\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010U\u001a\u00020;H\u0016J\b\u0010V\u001a\u00020;H\u0016J\u0012\u0010W\u001a\u00020;2\b\u0010X\u001a\u0004\u0018\u00010\tH\u0016J\u0016\u0010Y\u001a\u00020;2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0[H\u0016J\r\u0010\\\u001a\u00020 H\u0001\u00a2\u0006\u0002\b]J\b\u0010^\u001a\u00020;H\u0002J\b\u0010_\u001a\u00020;H\u0016J\b\u0010`\u001a\u00020;H\u0016J\u000e\u0010a\u001a\u00020;2\u0006\u0010b\u001a\u000204J\b\u0010c\u001a\u00020;H\u0016J\b\u0010d\u001a\u00020;H\u0016J\b\u0010e\u001a\u00020;H\u0002J\u0010\u0010f\u001a\u00020;2\u0006\u0010g\u001a\u000204H\u0016J\u0010\u0010h\u001a\u00020;2\u0006\u0010i\u001a\u00020\tH\u0016J\u0012\u0010j\u001a\u00020;2\b\u0010k\u001a\u0004\u0018\u00010lH\u0016J\u0018\u0010m\u001a\u00020;2\u000e\u0010n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010[H\u0016J\b\u0010o\u001a\u00020;H\u0002J\u0012\u0010p\u001a\u00020;2\b\u0010X\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010q\u001a\u00020;H\u0016J\b\u0010r\u001a\u00020;H\u0016J\b\u0010s\u001a\u00020;H\u0016J\b\u0010t\u001a\u00020;H\u0016J\b\u0010u\u001a\u00020;H\u0002J\u0010\u0010v\u001a\u00020;2\u0006\u0010N\u001a\u00020OH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000202X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006w"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/main/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/borisruzanov/russianwives/mvp/ui/main/MainView;", "Lcom/borisruzanov/russianwives/mvp/ui/filter/FilterDialogFragment$FilterListener;", "Lcom/borisruzanov/russianwives/mvp/ui/confirm/ConfirmDialogFragment$ConfirmListener;", "Lcom/borisruzanov/russianwives/mvp/ui/gender/GenderDialogFragment$GenderListener;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "()V", "APP_ID", "", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "mActionsFragment", "Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsFragment;", "mAdView", "Lcom/google/android/gms/ads/AdView;", "mCloseDrawerButton", "Landroid/widget/ImageView;", "mDialogFragment", "Landroid/support/v4/app/DialogFragment;", "mDrawerItemLogin", "Landroid/view/MenuItem;", "mDrawerItemLogout", "mDrawerItemSafety", "mDrawerItemSupport", "mDrawerLayout", "Landroid/support/v4/widget/DrawerLayout;", "mFilterButton", "Landroid/widget/RelativeLayout;", "mNavigationView", "Landroid/support/design/widget/NavigationView;", "mPresenter", "Lcom/borisruzanov/russianwives/mvp/ui/main/MainPresenter;", "getMPresenter", "()Lcom/borisruzanov/russianwives/mvp/ui/main/MainPresenter;", "setMPresenter", "(Lcom/borisruzanov/russianwives/mvp/ui/main/MainPresenter;)V", "mPurchaseSectionButton", "Landroid/widget/LinearLayout;", "mSearchFragment", "Lcom/borisruzanov/russianwives/mvp/ui/search/SearchFragment;", "mTabLayout", "Landroid/support/design/widget/TabLayout;", "mToolbar", "Landroid/support/v7/widget/Toolbar;", "getMToolbar", "()Landroid/support/v7/widget/Toolbar;", "setMToolbar", "(Landroid/support/v7/widget/Toolbar;)V", "mUnregisteredTitle", "Landroid/widget/TextView;", "mUserExist", "", "mViewPager", "Lcom/borisruzanov/russianwives/mvp/ui/main/adapter/CustomViewPager;", "mViewPagerAdapter", "Lcom/borisruzanov/russianwives/mvp/ui/main/adapter/MainPagerAdapter;", "mViewProfileButton", "analytics", "", "callAuthWindow", "callFilter", "drawerInit", "highlightChats", "messageSeen", "loadingListBasedOnUserExist", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onConfirm", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "menuItem", "onOptionsItemSelected", "item", "onPrepareOptionsMenu", "onUpdate", "onUpdateDialog", "openSearchedUser", "getmMessage", "openSlider", "stringList", "Ljava/util/ArrayList;", "provideMainPresenter", "provideMainPresenter$app_debug", "reload", "reviewDialogNo", "reviewDialogYes", "searchButtonHide", "result", "sendComplain", "sendToPlayMarket", "sendingToChatActivity", "setAdapter", "isUserExist", "setGender", "gender", "setUserData", "user", "Lcom/borisruzanov/russianwives/models/FsUser;", "showDefaultDialogScreen", "list", "showDialogs", "showErrorPopup", "showFullInfoDialog", "showGenderDialog", "showMustInfoDialog", "showUpdateDialog", "tabsInit", "validateMenuOnAuth", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements com.borisruzanov.russianwives.mvp.ui.main.MainView, com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment.FilterListener, com.borisruzanov.russianwives.mvp.ui.confirm.ConfirmDialogFragment.ConfirmListener, com.borisruzanov.russianwives.mvp.ui.gender.GenderDialogFragment.GenderListener, android.support.design.widget.NavigationView.OnNavigationItemSelectedListener {
    private final java.lang.String APP_ID = "ca-app-pub-5095813023957397~1146672660";
    private com.google.android.gms.ads.AdView mAdView;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    @javax.inject.Inject()
    public com.borisruzanov.russianwives.mvp.ui.main.MainPresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.Toolbar mToolbar;
    private android.support.design.widget.TabLayout mTabLayout;
    private com.borisruzanov.russianwives.mvp.ui.main.adapter.CustomViewPager mViewPager;
    private com.borisruzanov.russianwives.mvp.ui.main.adapter.MainPagerAdapter mViewPagerAdapter;
    private android.support.v4.widget.DrawerLayout mDrawerLayout;
    private android.support.design.widget.NavigationView mNavigationView;
    private android.view.MenuItem mDrawerItemSupport;
    private android.view.MenuItem mDrawerItemSafety;
    private android.view.MenuItem mDrawerItemLogout;
    private android.view.MenuItem mDrawerItemLogin;
    private android.widget.ImageView mCloseDrawerButton;
    private android.widget.TextView mViewProfileButton;
    private android.widget.LinearLayout mPurchaseSectionButton;
    private android.widget.RelativeLayout mFilterButton;
    private android.widget.TextView mUnregisteredTitle;
    private android.support.v4.app.DialogFragment mDialogFragment;
    private com.borisruzanov.russianwives.mvp.ui.search.SearchFragment mSearchFragment;
    private com.borisruzanov.russianwives.mvp.ui.actions.ActionsFragment mActionsFragment;
    private boolean mUserExist;
    private com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void showErrorPopup(@org.jetbrains.annotations.Nullable()
    java.lang.String getmMessage) {
    }
    
    @java.lang.Override()
    public void openSearchedUser(@org.jetbrains.annotations.Nullable()
    java.lang.String getmMessage) {
    }
    
    @java.lang.Override()
    public void onUpdateDialog() {
    }
    
    @java.lang.Override()
    public void reviewDialogYes() {
    }
    
    @java.lang.Override()
    public void showUpdateDialog() {
    }
    
    @java.lang.Override()
    public void showDefaultDialogScreen(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> list) {
    }
    
    @java.lang.Override()
    public void setUserData(@org.jetbrains.annotations.Nullable()
    com.borisruzanov.russianwives.models.FsUser user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.mvp.ui.main.MainPresenter getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.main.MainPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.Toolbar getMToolbar() {
        return null;
    }
    
    public final void setMToolbar(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final com.borisruzanov.russianwives.mvp.ui.main.MainPresenter provideMainPresenter$app_debug() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void tabsInit() {
    }
    
    public final void highlightChats(boolean messageSeen) {
    }
    
    private final void loadingListBasedOnUserExist() {
    }
    
    private final void showDialogs() {
    }
    
    private final void sendingToChatActivity() {
    }
    
    private final void drawerInit() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void analytics() {
    }
    
    @java.lang.Override()
    public void setAdapter(boolean isUserExist) {
    }
    
    @java.lang.Override()
    public void showGenderDialog() {
    }
    
    @java.lang.Override()
    public void showMustInfoDialog() {
    }
    
    @java.lang.Override()
    public void showFullInfoDialog() {
    }
    
    @java.lang.Override()
    public void openSlider(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> stringList) {
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void validateMenuOnAuth(android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    public final void searchButtonHide(boolean result) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void callAuthWindow() {
    }
    
    public final void callFilter() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onUpdate() {
    }
    
    @java.lang.Override()
    public void setGender(@org.jetbrains.annotations.NotNull()
    java.lang.String gender) {
    }
    
    @java.lang.Override()
    public void reviewDialogNo() {
    }
    
    @java.lang.Override()
    public void sendToPlayMarket() {
    }
    
    @java.lang.Override()
    public void sendComplain() {
    }
    
    @java.lang.Override()
    public void onConfirm() {
    }
    
    private final void reload() {
    }
    
    public MainActivity() {
        super();
    }
}