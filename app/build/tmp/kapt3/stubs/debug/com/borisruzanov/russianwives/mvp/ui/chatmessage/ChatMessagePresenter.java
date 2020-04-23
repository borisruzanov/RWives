package com.borisruzanov.russianwives.mvp.ui.chatmessage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessagePresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/chatmessage/ChatMessageView;", "interactor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/chatmessage/ChatMessageInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/chatmessage/ChatMessageInteractor;)V", "removeOldMessage", "", "chatUser", "", "id", "message", "sendImage", "friendUid", "imageUri", "Landroid/net/Uri;", "sendMessage", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ChatMessagePresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageView> {
    private final com.borisruzanov.russianwives.mvp.model.interactor.chatmessage.ChatMessageInteractor interactor = null;
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void sendImage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid, @org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri) {
    }
    
    public final void removeOldMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String chatUser, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @javax.inject.Inject()
    public ChatMessagePresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.chatmessage.ChatMessageInteractor interactor) {
        super();
    }
}