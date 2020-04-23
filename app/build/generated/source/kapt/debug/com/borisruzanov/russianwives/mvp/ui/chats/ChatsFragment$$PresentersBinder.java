package com.borisruzanov.russianwives.mvp.ui.chats;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class ChatsFragment$$PresentersBinder extends PresenterBinder<com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment> {
	public class chatsPresenterBinder extends PresenterField<com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment> {
		public chatsPresenterBinder() {
			super("chatsPresenter", PresenterType.LOCAL, null, com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter.class);
		}

		@Override
		public void bind(com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment target, MvpPresenter presenter) {
			target.chatsPresenter = (com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment delegated) {
			return delegated.provideChatsPresenter();
		}
	}

	public List<PresenterField<com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment>> getPresenterFields() {
		List<PresenterField<com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment>> presenters = new ArrayList<>();

		presenters.add(new chatsPresenterBinder());

		return presenters;
	}

}
