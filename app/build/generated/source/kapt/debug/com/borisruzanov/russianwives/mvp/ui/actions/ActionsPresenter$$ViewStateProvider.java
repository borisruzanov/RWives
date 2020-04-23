package com.borisruzanov.russianwives.mvp.ui.actions;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class ActionsPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new com.borisruzanov.russianwives.mvp.ui.actions.ActionsView$$State();
	}
}