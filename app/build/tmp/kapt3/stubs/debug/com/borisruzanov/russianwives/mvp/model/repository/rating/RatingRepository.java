package com.borisruzanov.russianwives.mvp.model.repository.rating;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/repository/rating/RatingRepository;", "", "()V", "users", "Lcom/google/firebase/firestore/CollectionReference;", "usersRef", "Lcom/google/firebase/database/DatabaseReference;", "addAchieveToFs", "", "achieveName", "", "addAchievement", "achievement", "addRating", "addPoint", "", "uid", "checkForAchieve", "params", "", "getRating", "callback", "Lcom/borisruzanov/russianwives/utils/RatingAchievementsCallback;", "Lcom/borisruzanov/russianwives/utils/RatingCallback;", "isAchExist", "Lcom/borisruzanov/russianwives/utils/BoolCallback;", "isAchievementExist", "app_debug"})
public final class RatingRepository {
    private final com.google.firebase.database.DatabaseReference usersRef = null;
    private final com.google.firebase.firestore.CollectionReference users = null;
    
    public final void isAchExist(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String achievement, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void isAchievementExist(@org.jetbrains.annotations.NotNull()
    java.lang.String achievement, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.BoolCallback callback) {
    }
    
    public final void addRating(double addPoint) {
    }
    
    public final void addRating(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, double addPoint) {
    }
    
    public final void checkForAchieve(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    java.lang.String achievement) {
    }
    
    public final void addAchievement(@org.jetbrains.annotations.NotNull()
    java.lang.String achievement) {
    }
    
    private final void addAchieveToFs(java.lang.String achieveName) {
    }
    
    public final void getRating(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.RatingCallback callback) {
    }
    
    public final void getRating(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.RatingAchievementsCallback callback) {
    }
    
    public RatingRepository() {
        super();
    }
}