package com.borisruzanov.russianwives.mvp.ui.actions;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class ActionsView$$State extends MvpViewState<com.borisruzanov.russianwives.mvp.ui.actions.ActionsView> implements com.borisruzanov.russianwives.mvp.ui.actions.ActionsView {

	@Override
	public  void showUserActions( java.util.List<com.borisruzanov.russianwives.models.ActionItem> actionItems) {
		ShowUserActionsCommand showUserActionsCommand = new ShowUserActionsCommand(actionItems);
		mViewCommands.beforeApply(showUserActionsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.actions.ActionsView view : mViews) {
			view.showUserActions(actionItems);
		}

		mViewCommands.afterApply(showUserActionsCommand);
	}

	@Override
	public  void updateUserActions( java.util.List<com.borisruzanov.russianwives.models.ActionItem> newActionItems) {
		UpdateUserActionsCommand updateUserActionsCommand = new UpdateUserActionsCommand(newActionItems);
		mViewCommands.beforeApply(updateUserActionsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.actions.ActionsView view : mViews) {
			view.updateUserActions(newActionItems);
		}

		mViewCommands.afterApply(updateUserActionsCommand);
	}

	@Override
	public  void openFriendProfile( java.lang.String friendUid) {
		OpenFriendProfileCommand openFriendProfileCommand = new OpenFriendProfileCommand(friendUid);
		mViewCommands.beforeApply(openFriendProfileCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.actions.ActionsView view : mViews) {
			view.openFriendProfile(friendUid);
		}

		mViewCommands.afterApply(openFriendProfileCommand);
	}


	public class ShowUserActionsCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.actions.ActionsView> {
		public final java.util.List<com.borisruzanov.russianwives.models.ActionItem> actionItems;

		ShowUserActionsCommand( java.util.List<com.borisruzanov.russianwives.models.ActionItem> actionItems) {
			super("showUserActions", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.actionItems = actionItems;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.actions.ActionsView mvpView) {
			mvpView.showUserActions(actionItems);
		}
	}

	public class UpdateUserActionsCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.actions.ActionsView> {
		public final java.util.List<com.borisruzanov.russianwives.models.ActionItem> newActionItems;

		UpdateUserActionsCommand( java.util.List<com.borisruzanov.russianwives.models.ActionItem> newActionItems) {
			super("updateUserActions", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.newActionItems = newActionItems;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.actions.ActionsView mvpView) {
			mvpView.updateUserActions(newActionItems);
		}
	}

	public class OpenFriendProfileCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.actions.ActionsView> {
		public final java.lang.String friendUid;

		OpenFriendProfileCommand( java.lang.String friendUid) {
			super("openFriendProfile", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.friendUid = friendUid;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.actions.ActionsView mvpView) {
			mvpView.openFriendProfile(friendUid);
		}
	}
}
