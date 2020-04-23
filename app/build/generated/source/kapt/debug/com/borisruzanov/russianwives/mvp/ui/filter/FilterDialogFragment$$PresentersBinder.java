package com.borisruzanov.russianwives.mvp.ui.filter;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class FilterDialogFragment$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment> {
	public class presenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogPresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment target, MvpPresenter presenter) {
			target.presenter = (com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment delegated) {
			return delegated.provideFilterDialogPresenter();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
