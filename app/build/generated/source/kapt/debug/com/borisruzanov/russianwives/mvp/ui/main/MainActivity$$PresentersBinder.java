package com.borisruzanov.russianwives.mvp.ui.main;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MainActivity$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.main.MainActivity> {
	public class mPresenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.main.MainActivity> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.main.MainPresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.main.MainActivity target, MvpPresenter presenter) {
			target.mPresenter = (com.borisruzanov.russianwives.mvp.ui.main.MainPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.main.MainActivity delegated) {
			return delegated.provideMainPresenter$app_debug();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.main.MainActivity>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.main.MainActivity>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
