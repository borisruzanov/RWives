package com.borisruzanov.russianwives.mvp.ui.search.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH&J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/search/adapter/FeedScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "(Landroid/support/v7/widget/LinearLayoutManager;)V", "Landroid/support/v7/widget/GridLayoutManager;", "(Landroid/support/v7/widget/GridLayoutManager;)V", "Landroid/support/v7/widget/StaggeredGridLayoutManager;", "(Landroid/support/v7/widget/StaggeredGridLayoutManager;)V", "currentPage", "", "isLoading", "", "isStoppedLoading", "()Z", "setStoppedLoading", "(Z)V", "mLayoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "previousTotalItemCount", "visibleThreshold", "onLoadMore", "", "page", "totalItemsCount", "view", "Landroid/support/v7/widget/RecyclerView;", "onScrolled", "dx", "dy", "resetState", "setStopLoading", "isStopLoading", "app_debug"})
public abstract class FeedScrollListener extends android.support.v7.widget.RecyclerView.OnScrollListener {
    
    /**
     * @important make sure that ITEMS_PER_PAGE is enough to have 3 rows below
     *     * otherwise it will never load the second page
     */
    private int visibleThreshold;
    private int currentPage;
    private int previousTotalItemCount;
    private boolean isLoading;
    private boolean isStoppedLoading;
    private android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager;
    
    public final boolean isStoppedLoading() {
        return false;
    }
    
    public final void setStoppedLoading(boolean p0) {
    }
    
    public final void setStopLoading(boolean isStopLoading) {
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView view, int dx, int dy) {
    }
    
    public final void resetState() {
    }
    
    public abstract void onLoadMore(int page, int totalItemsCount, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView view);
    
    public FeedScrollListener(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.LinearLayoutManager layoutManager) {
        super();
    }
    
    public FeedScrollListener(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.GridLayoutManager layoutManager) {
        super();
    }
    
    public FeedScrollListener(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.StaggeredGridLayoutManager layoutManager) {
        super();
    }
}