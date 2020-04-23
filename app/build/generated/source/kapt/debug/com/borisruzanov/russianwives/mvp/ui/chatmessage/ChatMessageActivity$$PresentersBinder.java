package com.borisruzanov.russianwives.mvp.ui.chatmessage;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class ChatMessageActivity$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity> {
	public class presenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity target, MvpPresenter presenter) {
			target.presenter = (com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity delegated) {
			return delegated.provideChatMessagePresenter();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
