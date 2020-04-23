package com.borisruzanov.russianwives.mvp.model.interactor.myprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/interactor/myprofile/MyProfileInteractor;", "", "repository", "Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;", "(Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;)V", "getActionsCountInfo", "", "callback", "Lcom/borisruzanov/russianwives/utils/ActionsCountInfoCallback;", "getAllCurrentUserInfo", "Lcom/borisruzanov/russianwives/utils/UserCallback;", "app_debug"})
public final class MyProfileInteractor {
    private final com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository repository = null;
    
    public final void getAllCurrentUserInfo(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.UserCallback callback) {
    }
    
    public final void getActionsCountInfo(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.ActionsCountInfoCallback callback) {
    }
    
    @javax.inject.Inject()
    public MyProfileInteractor(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository repository) {
        super();
    }
}