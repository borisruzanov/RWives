package com.borisruzanov.russianwives.mvp.model.interactor.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\rJ\u0006\u0010#\u001a\u00020\rJ\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0011J\u0006\u0010&\u001a\u00020\rJ\u000e\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u001cJ\u0006\u0010)\u001a\u00020\rJ\u0006\u0010*\u001a\u00020\rJ\u000e\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u001cJ\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020\rJ\u0006\u0010/\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/interactor/main/MainInteractor;", "", "userRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;", "hotUsersRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/hots/HotUsersRepository;", "mSystemRepository", "Lcom/borisruzanov/russianwives/mvp/model/data/SystemRepository;", "(Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/hots/HotUsersRepository;Lcom/borisruzanov/russianwives/mvp/model/data/SystemRepository;)V", "isUserExist", "", "()Z", "addMustInfo", "", "addUserToSendpulse", "changeUserOnlineStatus", "user", "Lcom/borisruzanov/russianwives/models/FsUser;", "checkForUpdateVersion", "getConfig", "getDefaultFieldsList", "getDefaultList", "callback", "Lcom/borisruzanov/russianwives/utils/StringsCallback;", "getHotUsers", "Lcom/borisruzanov/russianwives/utils/HotUsersCallback;", "getSecondaryInfo", "getUserGender", "", "kotlin.jvm.PlatformType", "hasDefaultMustInfo", "Lcom/borisruzanov/russianwives/utils/BoolCallback;", "hasNecessaryInfo", "isGenderDefault", "makeDialogOpenDateDefault", "roundRating", "saveInSocMed", "mFsUser", "saveUser", "searhUser", "idSoc", "setFPDialogLastOpenDate", "setFirstOpenDate", "setGender", "gender", "setUserInHot", "updateDb", "userHasMustInfo", "app_debug"})
public final class MainInteractor {
    private final boolean isUserExist = false;
    private final com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository userRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.hots.HotUsersRepository hotUsersRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.data.SystemRepository mSystemRepository = null;
    
    public final java.lang.String getUserGender() {
        return null;
    }
    
    public final boolean isUserExist() {
        return false;
    }
    
    public final void userHasMustInfo() {
    }
    
    public final void saveUser() {
    }
    
    public final void getDefaultFieldsList() {
    }
    
    public final void makeDialogOpenDateDefault() {
    }
    
    public final void setFirstOpenDate() {
    }
    
    public final boolean isGenderDefault() {
        return false;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    java.lang.String gender) {
    }
    
    public final void hasNecessaryInfo(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void hasDefaultMustInfo(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void addMustInfo() {
    }
    
    public final void setUserInHot() {
    }
    
    public final void getHotUsers(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.HotUsersCallback callback) {
    }
    
    public final void roundRating() {
    }
    
    public final void setFPDialogLastOpenDate() {
    }
    
    public final void getDefaultList(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.StringsCallback callback) {
    }
    
    public final void getSecondaryInfo() {
    }
    
    public final void changeUserOnlineStatus(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.models.FsUser user) {
    }
    
    public final void checkForUpdateVersion() {
    }
    
    public final void getConfig() {
    }
    
    public final void searhUser(@org.jetbrains.annotations.NotNull()
    java.lang.String idSoc) {
    }
    
    public final void updateDb() {
    }
    
    public final void saveInSocMed(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.models.FsUser mFsUser) {
    }
    
    public final void addUserToSendpulse() {
    }
    
    @javax.inject.Inject()
    public MainInteractor(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.hots.HotUsersRepository hotUsersRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.data.SystemRepository mSystemRepository) {
        super();
    }
}