package com.borisruzanov.russianwives.mvp.ui.search;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class SearchFragment$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.search.SearchFragment> {
	public class searchPresenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.search.SearchFragment> {
		public searchPresenterBinder() {
			super("searchPresenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.search.SearchFragment target, MvpPresenter presenter) {
			target.searchPresenter = (com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.search.SearchFragment delegated) {
			return delegated.providePresenter();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.search.SearchFragment>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.search.SearchFragment>> presenters = new ArrayList<>();

		presenters.add(new searchPresenterBinder());

		return presenters;
	}

}
