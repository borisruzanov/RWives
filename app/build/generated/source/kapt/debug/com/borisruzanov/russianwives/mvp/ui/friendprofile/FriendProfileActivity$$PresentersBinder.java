package com.borisruzanov.russianwives.mvp.ui.friendprofile;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class FriendProfileActivity$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity> {
	public class mPresenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfilePresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity target, MvpPresenter presenter) {
			target.mPresenter = (com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfilePresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity delegated) {
			return delegated.provideFriendProfilePresenter();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
