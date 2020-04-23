package com.borisruzanov.russianwives.mvp.ui.chats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsPresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/chats/ChatsView;", "interactor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/chats/ChatsInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/chats/ChatsInteractor;)V", "userChats", "Ljava/util/ArrayList;", "Lcom/borisruzanov/russianwives/models/UserChat;", "getUserChatList", "", "openChat", "position", "", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ChatsPresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.chats.ChatsView> {
    private final java.util.ArrayList<com.borisruzanov.russianwives.models.UserChat> userChats = null;
    private final com.borisruzanov.russianwives.mvp.model.interactor.chats.ChatsInteractor interactor = null;
    
    public final void getUserChatList() {
    }
    
    public final void openChat(int position) {
    }
    
    @javax.inject.Inject()
    public ChatsPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.chats.ChatsInteractor interactor) {
        super();
    }
}