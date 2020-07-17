package com.borisruzanov.russianwives.mvp.ui.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/borisruzanov/russianwives/mvp/ui/filter/FilterDialogPresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/borisruzanov/russianwives/mvp/ui/filter/FilterView;", "interactor", "Lcom/borisruzanov/russianwives/mvp/model/interactor/filter/FilterInteractor;", "(Lcom/borisruzanov/russianwives/mvp/model/interactor/filter/FilterInteractor;)V", "getSavedValues", "", "isNotDefault", "", "value", "", "saveValues", "spinners", "", "Landroid/widget/Spinner;", "checked", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class FilterDialogPresenter extends com.arellomobile.mvp.MvpPresenter<com.borisruzanov.russianwives.mvp.ui.filter.FilterView> {
    private final com.borisruzanov.russianwives.mvp.model.interactor.filter.FilterInteractor interactor = null;
    
    public final void getSavedValues() {
    }
    
    /**
     * *
     *     * a method to save value in searchModel
     *     * @param spinners a list of  spinners of filter
     *     * @param checked a boolean value to online Switch of filter
     */
    public final void saveValues(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.widget.Spinner> spinners, boolean checked) {
    }
    
    public final boolean isNotDefault(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    @javax.inject.Inject()
    public FilterDialogPresenter(@org.jetbrains.annotations.NotNull()
    com.borisruzanov.russianwives.mvp.model.interactor.filter.FilterInteractor interactor) {
        super();
    }
}