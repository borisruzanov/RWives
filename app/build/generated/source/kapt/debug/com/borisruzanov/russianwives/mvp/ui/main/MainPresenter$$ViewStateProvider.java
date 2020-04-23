package com.borisruzanov.russianwives.mvp.ui.main;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class MainPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new com.borisruzanov.russianwives.mvp.ui.main.MainView$$State();
	}
}