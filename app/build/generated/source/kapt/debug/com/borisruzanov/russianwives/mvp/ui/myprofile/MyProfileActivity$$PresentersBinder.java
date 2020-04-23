package com.borisruzanov.russianwives.mvp.ui.myprofile;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MyProfileActivity$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity> {
	public class presenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfilePresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity target, MvpPresenter presenter) {
			target.presenter = (com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfilePresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity delegated) {
			return delegated.provideMyProfilePresenter();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
