package com.borisruzanov.russianwives;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Lcom/borisruzanov/russianwives/App;", "Landroid/app/Application;", "()V", "component", "Lcom/borisruzanov/russianwives/di/component/AppComponent;", "getComponent", "()Lcom/borisruzanov/russianwives/di/component/AppComponent;", "component$delegate", "Lkotlin/Lazy;", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mPrefs", "Lcom/borisruzanov/russianwives/mvp/model/data/prefs/Prefs;", "mSystemRepository", "Lcom/borisruzanov/russianwives/mvp/model/data/SystemRepository;", "mUserDatabase", "Lcom/google/firebase/database/DatabaseReference;", "sAnalytics", "Lcom/google/android/gms/analytics/GoogleAnalytics;", "sTracker", "Lcom/google/android/gms/analytics/Tracker;", "getSTracker", "()Lcom/google/android/gms/analytics/Tracker;", "setSTracker", "(Lcom/google/android/gms/analytics/Tracker;)V", "getTracker", "onCreate", "", "onlineStatusUsersTable", "AnalyticsTracker", "app_debug"})
public final class App extends android.app.Application {
    private com.google.firebase.database.DatabaseReference mUserDatabase;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private com.google.android.gms.analytics.GoogleAnalytics sAnalytics;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.analytics.Tracker sTracker;
    private com.borisruzanov.russianwives.mvp.model.data.SystemRepository mSystemRepository;
    private com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs mPrefs;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy component$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.analytics.Tracker getSTracker() {
        return null;
    }
    
    public final void setSTracker(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.analytics.Tracker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.borisruzanov.russianwives.di.component.AppComponent getComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * * Setting online / offline status to the user in Users table
     */
    private final void onlineStatusUsersTable() {
    }
    
    /**
     * * Gets the default [Tracker] for this [Application].
     *     * @return tracker
     */
    @org.jetbrains.annotations.NotNull()
    public final synchronized com.google.android.gms.analytics.Tracker getTracker() {
        return null;
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/borisruzanov/russianwives/App$AnalyticsTracker;", "", "()V", "sAnalytics", "Lcom/google/android/gms/analytics/GoogleAnalytics;", "sTracker", "Lcom/google/android/gms/analytics/Tracker;", "getSTracker", "()Lcom/google/android/gms/analytics/Tracker;", "setSTracker", "(Lcom/google/android/gms/analytics/Tracker;)V", "onCreate", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class AnalyticsTracker {
        @org.jetbrains.annotations.NotNull()
        public static com.google.android.gms.analytics.Tracker sTracker;
        private static com.google.android.gms.analytics.GoogleAnalytics sAnalytics;
        public static final com.borisruzanov.russianwives.App.AnalyticsTracker INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.analytics.Tracker getSTracker() {
            return null;
        }
        
        public final void setSTracker(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.analytics.Tracker p0) {
        }
        
        public final void onCreate(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private AnalyticsTracker() {
            super();
        }
    }
}