package com.borisruzanov.russianwives.mvp.ui.chats;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class ChatsView$$State extends MvpViewState<com.borisruzanov.russianwives.mvp.ui.chats.ChatsView> implements com.borisruzanov.russianwives.mvp.ui.chats.ChatsView {

	@Override
	public  void openChat( java.lang.String uid,  java.lang.String name,  java.lang.String image) {
		OpenChatCommand openChatCommand = new OpenChatCommand(uid, name, image);
		mViewCommands.beforeApply(openChatCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView view : mViews) {
			view.openChat(uid, name, image);
		}

		mViewCommands.afterApply(openChatCommand);
	}

	@Override
	public  void showUserChats( java.util.List<com.borisruzanov.russianwives.models.UserChat> userChats) {
		ShowUserChatsCommand showUserChatsCommand = new ShowUserChatsCommand(userChats);
		mViewCommands.beforeApply(showUserChatsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView view : mViews) {
			view.showUserChats(userChats);
		}

		mViewCommands.afterApply(showUserChatsCommand);
	}

	@Override
	public  void showErrorMessage() {
		ShowErrorMessageCommand showErrorMessageCommand = new ShowErrorMessageCommand();
		mViewCommands.beforeApply(showErrorMessageCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView view : mViews) {
			view.showErrorMessage();
		}

		mViewCommands.afterApply(showErrorMessageCommand);
	}

	@Override
	public  void highlightChats( boolean messageSeen) {
		HighlightChatsCommand highlightChatsCommand = new HighlightChatsCommand(messageSeen);
		mViewCommands.beforeApply(highlightChatsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView view : mViews) {
			view.highlightChats(messageSeen);
		}

		mViewCommands.afterApply(highlightChatsCommand);
	}


	public class OpenChatCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.chats.ChatsView> {
		public final java.lang.String uid;
		public final java.lang.String name;
		public final java.lang.String image;

		OpenChatCommand( java.lang.String uid,  java.lang.String name,  java.lang.String image) {
			super("openChat", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.uid = uid;
			this.name = name;
			this.image = image;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView mvpView) {
			mvpView.openChat(uid, name, image);
		}
	}

	public class ShowUserChatsCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.chats.ChatsView> {
		public final java.util.List<com.borisruzanov.russianwives.models.UserChat> userChats;

		ShowUserChatsCommand( java.util.List<com.borisruzanov.russianwives.models.UserChat> userChats) {
			super("showUserChats", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.userChats = userChats;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView mvpView) {
			mvpView.showUserChats(userChats);
		}
	}

	public class ShowErrorMessageCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.chats.ChatsView> {
		ShowErrorMessageCommand() {
			super("showErrorMessage", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView mvpView) {
			mvpView.showErrorMessage();
		}
	}

	public class HighlightChatsCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.chats.ChatsView> {
		public final boolean messageSeen;

		HighlightChatsCommand( boolean messageSeen) {
			super("highlightChats", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.messageSeen = messageSeen;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.chats.ChatsView mvpView) {
			mvpView.highlightChats(messageSeen);
		}
	}
}
