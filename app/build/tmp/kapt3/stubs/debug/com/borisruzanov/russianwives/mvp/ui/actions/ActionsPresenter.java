package com.borisruzanov.russianwives.mvp.ui.actions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J*\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsPresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/actions/ActionsView;", "interactor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/actions/ActionsInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/actions/ActionsInteractor;)V", "actionItems", "Ljava/util/ArrayList;", "Lcom/borisruzanov/russianwives/models/ActionItem;", "listEqualsIgnoreOrder", "", "T", "list1", "", "list2", "openFriendProfile", "", "position", "", "setActionsList", "updateActionsList", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ActionsPresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.actions.ActionsView> {
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.ActionItem> actionItems = null;
    private final com.borisruzanov.russianwives.mvp.model.interactor.actions.ActionsInteractor interactor = null;
    
    public final void setActionsList() {
    }
    
    public final void updateActionsList() {
    }
    
    public final void openFriendProfile(int position) {
    }
    
    private final <T extends java.lang.Object>boolean listEqualsIgnoreOrder(java.util.List<? extends T> list1, java.util.List<? extends T> list2) {
        return false;
    }
    
    @javax.inject.Inject()
    public ActionsPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.actions.ActionsInteractor interactor) {
        super();
    }
}