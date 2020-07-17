package com.borisruzanov.russianwives.mvp.ui.main;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class MainView$$State extends MvpViewState<com.borisruzanov.russianwives.mvp.ui.main.MainView> implements com.borisruzanov.russianwives.mvp.ui.main.MainView {

	@Override
	public  void callAuthWindow() {
		CallAuthWindowCommand callAuthWindowCommand = new CallAuthWindowCommand();
		mViewCommands.beforeApply(callAuthWindowCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.callAuthWindow();
		}

		mViewCommands.afterApply(callAuthWindowCommand);
	}

	@Override
	public  void setAdapter( boolean isUserExist) {
		SetAdapterCommand setAdapterCommand = new SetAdapterCommand(isUserExist);
		mViewCommands.beforeApply(setAdapterCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.setAdapter(isUserExist);
		}

		mViewCommands.afterApply(setAdapterCommand);
	}

	@Override
	public  void showGenderDialog() {
		ShowGenderDialogCommand showGenderDialogCommand = new ShowGenderDialogCommand();
		mViewCommands.beforeApply(showGenderDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.showGenderDialog();
		}

		mViewCommands.afterApply(showGenderDialogCommand);
	}

	@Override
	public  void showMustInfoDialog() {
		ShowMustInfoDialogCommand showMustInfoDialogCommand = new ShowMustInfoDialogCommand();
		mViewCommands.beforeApply(showMustInfoDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.showMustInfoDialog();
		}

		mViewCommands.afterApply(showMustInfoDialogCommand);
	}

	@Override
	public  void showFullInfoDialog() {
		ShowFullInfoDialogCommand showFullInfoDialogCommand = new ShowFullInfoDialogCommand();
		mViewCommands.beforeApply(showFullInfoDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.showFullInfoDialog();
		}

		mViewCommands.afterApply(showFullInfoDialogCommand);
	}

	@Override
	public  void openSlider( java.util.ArrayList<java.lang.String> stringList) {
		OpenSliderCommand openSliderCommand = new OpenSliderCommand(stringList);
		mViewCommands.beforeApply(openSliderCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.openSlider(stringList);
		}

		mViewCommands.afterApply(openSliderCommand);
	}

	@Override
	public  void setUserData( com.borisruzanov.russianwives.models.FsUser user) {
		SetUserDataCommand setUserDataCommand = new SetUserDataCommand(user);
		mViewCommands.beforeApply(setUserDataCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.setUserData(user);
		}

		mViewCommands.afterApply(setUserDataCommand);
	}

	@Override
	public  void showDefaultDialogScreen( java.util.ArrayList<java.lang.String> list) {
		ShowDefaultDialogScreenCommand showDefaultDialogScreenCommand = new ShowDefaultDialogScreenCommand(list);
		mViewCommands.beforeApply(showDefaultDialogScreenCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.showDefaultDialogScreen(list);
		}

		mViewCommands.afterApply(showDefaultDialogScreenCommand);
	}

	@Override
	public  void showUpdateDialog() {
		ShowUpdateDialogCommand showUpdateDialogCommand = new ShowUpdateDialogCommand();
		mViewCommands.beforeApply(showUpdateDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.showUpdateDialog();
		}

		mViewCommands.afterApply(showUpdateDialogCommand);
	}

	@Override
	public  void openSearchedUser( java.lang.String getmMessage) {
		OpenSearchedUserCommand openSearchedUserCommand = new OpenSearchedUserCommand(getmMessage);
		mViewCommands.beforeApply(openSearchedUserCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.openSearchedUser(getmMessage);
		}

		mViewCommands.afterApply(openSearchedUserCommand);
	}

	@Override
	public  void showErrorPopup( java.lang.String getmMessage) {
		ShowErrorPopupCommand showErrorPopupCommand = new ShowErrorPopupCommand(getmMessage);
		mViewCommands.beforeApply(showErrorPopupCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.showErrorPopup(getmMessage);
		}

		mViewCommands.afterApply(showErrorPopupCommand);
	}

	@Override
	public  void completeRegistration() {
		CompleteRegistrationCommand completeRegistrationCommand = new CompleteRegistrationCommand();
		mViewCommands.beforeApply(completeRegistrationCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.main.MainView view : mViews) {
			view.completeRegistration();
		}

		mViewCommands.afterApply(completeRegistrationCommand);
	}


	public class CallAuthWindowCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		CallAuthWindowCommand() {
			super("callAuthWindow", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.callAuthWindow();
		}
	}

	public class SetAdapterCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		public final boolean isUserExist;

		SetAdapterCommand( boolean isUserExist) {
			super("setAdapter", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.isUserExist = isUserExist;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.setAdapter(isUserExist);
		}
	}

	public class ShowGenderDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		ShowGenderDialogCommand() {
			super("showGenderDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.showGenderDialog();
		}
	}

	public class ShowMustInfoDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		ShowMustInfoDialogCommand() {
			super("showMustInfoDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.showMustInfoDialog();
		}
	}

	public class ShowFullInfoDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		ShowFullInfoDialogCommand() {
			super("showFullInfoDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.showFullInfoDialog();
		}
	}

	public class OpenSliderCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		public final java.util.ArrayList<java.lang.String> stringList;

		OpenSliderCommand( java.util.ArrayList<java.lang.String> stringList) {
			super("openSlider", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.stringList = stringList;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.openSlider(stringList);
		}
	}

	public class SetUserDataCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		public final com.borisruzanov.russianwives.models.FsUser user;

		SetUserDataCommand( com.borisruzanov.russianwives.models.FsUser user) {
			super("setUserData", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.user = user;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.setUserData(user);
		}
	}

	public class ShowDefaultDialogScreenCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		public final java.util.ArrayList<java.lang.String> list;

		ShowDefaultDialogScreenCommand( java.util.ArrayList<java.lang.String> list) {
			super("showDefaultDialogScreen", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.list = list;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.showDefaultDialogScreen(list);
		}
	}

	public class ShowUpdateDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		ShowUpdateDialogCommand() {
			super("showUpdateDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.showUpdateDialog();
		}
	}

	public class OpenSearchedUserCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		public final java.lang.String getmMessage;

		OpenSearchedUserCommand( java.lang.String getmMessage) {
			super("openSearchedUser", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.getmMessage = getmMessage;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.openSearchedUser(getmMessage);
		}
	}

	public class ShowErrorPopupCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		public final java.lang.String getmMessage;

		ShowErrorPopupCommand( java.lang.String getmMessage) {
			super("showErrorPopup", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.getmMessage = getmMessage;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.showErrorPopup(getmMessage);
		}
	}

	public class CompleteRegistrationCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.main.MainView> {
		CompleteRegistrationCommand() {
			super("completeRegistration", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.main.MainView mvpView) {
			mvpView.completeRegistration();
		}
	}
}
