package com.borisruzanov.russianwives.mvp.ui.actions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0007H\u0007J\u0016\u0010!\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\u0016\u0010%\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsFragment;", "Lcom/arellomobile/mvp/MvpAppCompatFragment;", "Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsView;", "()V", "actionsAdapter", "Lcom/borisruzanov/russianwives/mvp/ui/actions/adapter/ActionsAdapter;", "actionsPresenter", "Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsPresenter;", "getActionsPresenter", "()Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsPresenter;", "setActionsPresenter", "(Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsPresenter;)V", "emptyLayout", "Landroid/widget/RelativeLayout;", "onItemClickCallback", "Lcom/borisruzanov/russianwives/OnItemClickListener$OnItemClickCallback;", "recyclerActivitiesList", "Landroid/support/v7/widget/RecyclerView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "openFriendProfile", "friendUid", "", "provideActionsPresenter", "showUserActions", "actionItems", "", "Lcom/borisruzanov/russianwives/models/ActionItem;", "updateUserActions", "newActionItems", "app_debug"})
public final class ActionsFragment extends com.arellomobile.mvp.MvpAppCompatFragment implements com.borisruzanov.russianwives.mvp.ui.actions.ActionsView {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    @javax.inject.Inject()
    public com.borisruzanov.russianwives.mvp.ui.actions.ActionsPresenter actionsPresenter;
    private android.support.v7.widget.RecyclerView recyclerActivitiesList;
    private android.widget.RelativeLayout emptyLayout;
    private final com.borisruzanov.russianwives.OnItemClickListener.OnItemClickCallback onItemClickCallback = null;
    private final com.borisruzanov.russianwives.mvp.ui.actions.adapter.ActionsAdapter actionsAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.mvp.ui.actions.ActionsPresenter getActionsPresenter() {
        return null;
    }
    
    public final void setActionsPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.ui.actions.ActionsPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final com.borisruzanov.russianwives.mvp.ui.actions.ActionsPresenter provideActionsPresenter() {
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
    
    @java.lang.Override()
    public void showUserActions(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.borisruzanov.russianwives.models.ActionItem> actionItems) {
    }
    
    @java.lang.Override()
    public void updateUserActions(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.borisruzanov.russianwives.models.ActionItem> newActionItems) {
    }
    
    @java.lang.Override()
    public void openFriendProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public ActionsFragment() {
        super();
    }
}