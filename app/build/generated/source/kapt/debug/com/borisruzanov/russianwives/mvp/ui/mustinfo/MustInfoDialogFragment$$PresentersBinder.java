package com.borisruzanov.russianwives.mvp.ui.mustinfo;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MustInfoDialogFragment$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment> {
	public class presenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogPresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment target, MvpPresenter presenter) {
			target.presenter = (com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment delegated) {
			return delegated.provideMustInfoDialogPresenter();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
