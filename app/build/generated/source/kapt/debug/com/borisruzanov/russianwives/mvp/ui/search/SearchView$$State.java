package com.borisruzanov.russianwives.mvp.ui.search;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class SearchView$$State extends MvpViewState<com.borisruzanov.russianwives.mvp.ui.search.SearchView> implements com.borisruzanov.russianwives.mvp.ui.search.SearchView {

	@Override
	public  void setProgressBar( boolean isLoading) {
		SetProgressBarCommand setProgressBarCommand = new SetProgressBarCommand(isLoading);
		mViewCommands.beforeApply(setProgressBarCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.setProgressBar(isLoading);
		}

		mViewCommands.afterApply(setProgressBarCommand);
	}

	@Override
	public  void showEmpty( boolean show) {
		ShowEmptyCommand showEmptyCommand = new ShowEmptyCommand(show);
		mViewCommands.beforeApply(showEmptyCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.showEmpty(show);
		}

		mViewCommands.afterApply(showEmptyCommand);
	}

	@Override
	public  void addUsers( java.util.List<com.borisruzanov.russianwives.models.FsUser> usersList) {
		AddUsersCommand addUsersCommand = new AddUsersCommand(usersList);
		mViewCommands.beforeApply(addUsersCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.addUsers(usersList);
		}

		mViewCommands.afterApply(addUsersCommand);
	}

	@Override
	public  void addHotUsers( java.util.List<com.borisruzanov.russianwives.models.HotUser> hotUsers) {
		AddHotUsersCommand addHotUsersCommand = new AddHotUsersCommand(hotUsers);
		mViewCommands.beforeApply(addHotUsersCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.addHotUsers(hotUsers);
		}

		mViewCommands.afterApply(addHotUsersCommand);
	}

	@Override
	public  void clearUsers() {
		ClearUsersCommand clearUsersCommand = new ClearUsersCommand();
		mViewCommands.beforeApply(clearUsersCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.clearUsers();
		}

		mViewCommands.afterApply(clearUsersCommand);
	}

	@Override
	public  void onUpdate() {
		OnUpdateCommand onUpdateCommand = new OnUpdateCommand();
		mViewCommands.beforeApply(onUpdateCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.onUpdate();
		}

		mViewCommands.afterApply(onUpdateCommand);
	}

	@Override
	public  void showError() {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand();
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.showError();
		}

		mViewCommands.afterApply(showErrorCommand);
	}

	@Override
	public  void openFriend( java.lang.String uid,  java.lang.String transitionName,  android.os.Bundle args) {
		OpenFriendCommand openFriendCommand = new OpenFriendCommand(uid, transitionName, args);
		mViewCommands.beforeApply(openFriendCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.openFriend(uid, transitionName, args);
		}

		mViewCommands.afterApply(openFriendCommand);
	}

	@Override
	public  void openChat( java.lang.String uid,  java.lang.String name,  java.lang.String image) {
		OpenChatCommand openChatCommand = new OpenChatCommand(uid, name, image);
		mViewCommands.beforeApply(openChatCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.openChat(uid, name, image);
		}

		mViewCommands.afterApply(openChatCommand);
	}

	@Override
	public  void showFullProfileDialog() {
		ShowFullProfileDialogCommand showFullProfileDialogCommand = new ShowFullProfileDialogCommand();
		mViewCommands.beforeApply(showFullProfileDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.showFullProfileDialog();
		}

		mViewCommands.afterApply(showFullProfileDialogCommand);
	}

	@Override
	public  void openRewardActivity() {
		OpenRewardActivityCommand openRewardActivityCommand = new OpenRewardActivityCommand();
		mViewCommands.beforeApply(openRewardActivityCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.openRewardActivity();
		}

		mViewCommands.afterApply(openRewardActivityCommand);
	}

	@Override
	public  void openPurchaseDialog() {
		OpenPurchaseDialogCommand openPurchaseDialogCommand = new OpenPurchaseDialogCommand();
		mViewCommands.beforeApply(openPurchaseDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.openPurchaseDialog();
		}

		mViewCommands.afterApply(openPurchaseDialogCommand);
	}

	@Override
	public  void setHotsLoaded() {
		SetHotsLoadedCommand setHotsLoadedCommand = new SetHotsLoadedCommand();
		mViewCommands.beforeApply(setHotsLoadedCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.setHotsLoaded();
		}

		mViewCommands.afterApply(setHotsLoadedCommand);
	}

	@Override
	public  void openHotUser( java.lang.String uid) {
		OpenHotUserCommand openHotUserCommand = new OpenHotUserCommand(uid);
		mViewCommands.beforeApply(openHotUserCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.openHotUser(uid);
		}

		mViewCommands.afterApply(openHotUserCommand);
	}

	@Override
	public  void openSlider( java.util.ArrayList<java.lang.String> sliderList) {
		OpenSliderCommand openSliderCommand = new OpenSliderCommand(sliderList);
		mViewCommands.beforeApply(openSliderCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.openSlider(sliderList);
		}

		mViewCommands.afterApply(openSliderCommand);
	}

	@Override
	public  void showRegistrationDialog() {
		ShowRegistrationDialogCommand showRegistrationDialogCommand = new ShowRegistrationDialogCommand();
		mViewCommands.beforeApply(showRegistrationDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.showRegistrationDialog();
		}

		mViewCommands.afterApply(showRegistrationDialogCommand);
	}

	@Override
	public  void userWereNotFoundMsg() {
		UserWereNotFoundMsgCommand userWereNotFoundMsgCommand = new UserWereNotFoundMsgCommand();
		mViewCommands.beforeApply(userWereNotFoundMsgCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.search.SearchView view : mViews) {
			view.userWereNotFoundMsg();
		}

		mViewCommands.afterApply(userWereNotFoundMsgCommand);
	}


	public class SetProgressBarCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		public final boolean isLoading;

		SetProgressBarCommand( boolean isLoading) {
			super("setProgressBar", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.isLoading = isLoading;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.setProgressBar(isLoading);
		}
	}

	public class ShowEmptyCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		public final boolean show;

		ShowEmptyCommand( boolean show) {
			super("showEmpty", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.show = show;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.showEmpty(show);
		}
	}

	public class AddUsersCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		public final java.util.List<com.borisruzanov.russianwives.models.FsUser> usersList;

		AddUsersCommand( java.util.List<com.borisruzanov.russianwives.models.FsUser> usersList) {
			super("addUsers", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.usersList = usersList;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.addUsers(usersList);
		}
	}

	public class AddHotUsersCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		public final java.util.List<com.borisruzanov.russianwives.models.HotUser> hotUsers;

		AddHotUsersCommand( java.util.List<com.borisruzanov.russianwives.models.HotUser> hotUsers) {
			super("addHotUsers", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.hotUsers = hotUsers;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.addHotUsers(hotUsers);
		}
	}

	public class ClearUsersCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		ClearUsersCommand() {
			super("clearUsers", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.clearUsers();
		}
	}

	public class OnUpdateCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		OnUpdateCommand() {
			super("onUpdate", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.onUpdate();
		}
	}

	public class ShowErrorCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		ShowErrorCommand() {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.showError();
		}
	}

	public class OpenFriendCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		public final java.lang.String uid;
		public final java.lang.String transitionName;
		public final android.os.Bundle args;

		OpenFriendCommand( java.lang.String uid,  java.lang.String transitionName,  android.os.Bundle args) {
			super("openFriend", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.uid = uid;
			this.transitionName = transitionName;
			this.args = args;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.openFriend(uid, transitionName, args);
		}
	}

	public class OpenChatCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
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
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.openChat(uid, name, image);
		}
	}

	public class ShowFullProfileDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		ShowFullProfileDialogCommand() {
			super("showFullProfileDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.showFullProfileDialog();
		}
	}

	public class OpenRewardActivityCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		OpenRewardActivityCommand() {
			super("openRewardActivity", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.openRewardActivity();
		}
	}

	public class OpenPurchaseDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		OpenPurchaseDialogCommand() {
			super("openPurchaseDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.openPurchaseDialog();
		}
	}

	public class SetHotsLoadedCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		SetHotsLoadedCommand() {
			super("setHotsLoaded", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.setHotsLoaded();
		}
	}

	public class OpenHotUserCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		public final java.lang.String uid;

		OpenHotUserCommand( java.lang.String uid) {
			super("openHotUser", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.uid = uid;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.openHotUser(uid);
		}
	}

	public class OpenSliderCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		public final java.util.ArrayList<java.lang.String> sliderList;

		OpenSliderCommand( java.util.ArrayList<java.lang.String> sliderList) {
			super("openSlider", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.sliderList = sliderList;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.openSlider(sliderList);
		}
	}

	public class ShowRegistrationDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		ShowRegistrationDialogCommand() {
			super("showRegistrationDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.showRegistrationDialog();
		}
	}

	public class UserWereNotFoundMsgCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.search.SearchView> {
		UserWereNotFoundMsgCommand() {
			super("userWereNotFoundMsg", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.search.SearchView mvpView) {
			mvpView.userWereNotFoundMsg();
		}
	}
}
