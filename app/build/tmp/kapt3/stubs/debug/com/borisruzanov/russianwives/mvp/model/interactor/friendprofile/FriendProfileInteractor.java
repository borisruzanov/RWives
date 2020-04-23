package com.borisruzanov.russianwives.mvp.model.interactor.friendprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/interactor/friendprofile/FriendProfileInteractor;", "", "repository", "Lcom/borisruzanov/russianwives/mvp/model/repository/friend/FriendRepository;", "userRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;", "ratingRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/rating/RatingRepository;", "(Lcom/borisruzanov/russianwives/mvp/model/repository/friend/FriendRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/rating/RatingRepository;)V", "addRatingLiked", "", "friendUid", "", "addRatingVisited", "checkFullProfileAchieve", "callback", "Lcom/borisruzanov/russianwives/utils/BoolCallback;", "getDefaultList", "Lcom/borisruzanov/russianwives/utils/StringsCallback;", "getFriendData", "userCallback", "Lcom/borisruzanov/russianwives/utils/UserCallback;", "hasMustInfo", "isLiked", "isUserExist", "", "saveUser", "setFriendLiked", "setFriendVisited", "app_debug"})
public final class FriendProfileInteractor {
    private final com.borisruzanov.russianwives.mvp.model.repository.friend.FriendRepository repository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository userRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository ratingRepository = null;
    
    public final void getFriendData(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.UserCallback userCallback) {
    }
    
    public final void setFriendVisited(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void hasMustInfo(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void addRatingVisited(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void addRatingLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void setFriendLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final boolean isUserExist() {
        return false;
    }
    
    public final void saveUser() {
    }
    
    public final void getDefaultList(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.StringsCallback callback) {
    }
    
    public final void isLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void checkFullProfileAchieve(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    @javax.inject.Inject()
    public FriendProfileInteractor(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.friend.FriendRepository repository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository ratingRepository) {
        super();
    }
}