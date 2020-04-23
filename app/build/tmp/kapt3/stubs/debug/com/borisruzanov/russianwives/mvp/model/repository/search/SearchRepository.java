package com.borisruzanov.russianwives.mvp.model.repository.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/repository/search/SearchRepository;", "", "()V", "lastUserInPage", "Lcom/google/firebase/firestore/DocumentSnapshot;", "mDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "reference", "Lcom/google/firebase/firestore/CollectionReference;", "addingIndexInDb", "", "message", "", "getUsers", "filterParams", "", "Lcom/borisruzanov/russianwives/models/SearchModel;", "usersListCallback", "Lcom/borisruzanov/russianwives/utils/UsersListCallback;", "page", "", "putCallbackData", "documentsSnapshot", "Lcom/google/firebase/firestore/QuerySnapshot;", "Companion", "app_debug"})
public final class SearchRepository {
    private com.google.firebase.firestore.DocumentSnapshot lastUserInPage;
    private final com.google.firebase.firestore.CollectionReference reference = null;
    private final com.google.firebase.database.FirebaseDatabase mDatabase = null;
    public static final int ITEMS_PER_PAGE = 20;
    public static final com.borisruzanov.russianwives.mvp.model.repository.search.SearchRepository.Companion Companion = null;
    
    public final void getUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.borisruzanov.russianwives.models.SearchModel> filterParams, @org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.utils.UsersListCallback usersListCallback, int page) {
    }
    
    private final void addingIndexInDb(java.lang.String message) {
    }
    
    private final void putCallbackData(com.borisruzanov.russianwives.utils.UsersListCallback usersListCallback, com.google.firebase.firestore.QuerySnapshot documentsSnapshot) {
    }
    
    public SearchRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/model/repository/search/SearchRepository$Companion;", "", "()V", "ITEMS_PER_PAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}