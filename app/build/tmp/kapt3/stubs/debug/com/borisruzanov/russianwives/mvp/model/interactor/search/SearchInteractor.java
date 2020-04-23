package com.borisruzanov.russianwives.mvp.model.interactor.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/interactor/search/SearchInteractor;", "", "searchRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/search/SearchRepository;", "filterRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/filter/FilterRepository;", "friendRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/friend/FriendRepository;", "ratingRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/rating/RatingRepository;", "userRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;", "hotsRepository", "Lcom/borisruzanov/russianwives/mvp/model/repository/hots/HotUsersRepository;", "(Lcom/borisruzanov/russianwives/mvp/model/repository/search/SearchRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/filter/FilterRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/friend/FriendRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/rating/RatingRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/user/UserRepository;Lcom/borisruzanov/russianwives/mvp/model/repository/hots/HotUsersRepository;)V", "addRatingLiked", "", "friendUid", "", "checkFullProfileAchieve", "callback", "Lcom/borisruzanov/russianwives/utils/BoolCallback;", "getDefaultList", "Lcom/borisruzanov/russianwives/utils/StringsCallback;", "getFilteredUserList", "usersListCallback", "Lcom/borisruzanov/russianwives/utils/UsersListCallback;", "page", "", "getHotUsers", "Lcom/borisruzanov/russianwives/utils/HotUsersCallback;", "getHotUsersByPage", "hasMustInfo", "isFriendLiked", "setFriendLiked", "setUserInHot", "app_debug"})
public final class SearchInteractor {
    private final com.borisruzanov.russianwives.mvp.model.repository.search.SearchRepository searchRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.filter.FilterRepository filterRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.friend.FriendRepository friendRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository ratingRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository userRepository = null;
    private final com.borisruzanov.russianwives.mvp.model.repository.hots.HotUsersRepository hotsRepository = null;
    
    public final void setFriendLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void isFriendLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void getFilteredUserList(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.UsersListCallback usersListCallback, int page) {
    }
    
    public final void addRatingLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String friendUid) {
    }
    
    public final void hasMustInfo(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void setUserInHot() {
    }
    
    public final void getHotUsers(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.HotUsersCallback callback) {
    }
    
    public final void getHotUsersByPage(int page, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.HotUsersCallback callback) {
    }
    
    public final void getDefaultList(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.StringsCallback callback) {
    }
    
    public final void checkFullProfileAchieve(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    @javax.inject.Inject()
    public SearchInteractor(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.search.SearchRepository searchRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.filter.FilterRepository filterRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.friend.FriendRepository friendRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository ratingRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.repository.hots.HotUsersRepository hotsRepository) {
        super();
    }
}