package com.borisruzanov.russianwives.mvp.model.interactor.chatmessage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/interactor/chatmessage/ChatMessageInteractor;", "", "repository", "Lcom/borisruzanov/russianwives/mvp/model/repository/chatmessage/ChatMessageRepository;", "(Lcom/borisruzanov/russianwives/mvp/model/repository/chatmessage/ChatMessageRepository;)V", "initChat", "", "friendUid", "", "removeOldMessage", "chatUser", "id", "message", "sendImage", "imageUri", "Landroid/net/Uri;", "callback", "Lcom/borisruzanov/russianwives/utils/UpdateCallback;", "sendMessage", "app_debug"})
public final class ChatMessageInteractor {
    private final com.borisruzanov.russianwives.mvp.model.repository.chatmessage.ChatMessageRepository repository = null;
    
    public final void initChat(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.UpdateCallback callback) {
    }
    
    public final void sendImage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid, @org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.UpdateCallback callback) {
    }
    
    public final void removeOldMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String chatUser, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @javax.inject.Inject()
    public ChatMessageInteractor(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.chatmessage.ChatMessageRepository repository) {
        super();
    }
}