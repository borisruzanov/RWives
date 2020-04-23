package com.borisruzanov.russianwives.mvp.ui.mustinfo;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class MustInfoDialogView$$State extends MvpViewState<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView> implements com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView {

	@Override
	public  void showProgress() {
		ShowProgressCommand showProgressCommand = new ShowProgressCommand();
		mViewCommands.beforeApply(showProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView view : mViews) {
			view.showProgress();
		}

		mViewCommands.afterApply(showProgressCommand);
	}

	@Override
	public  void hideProgress() {
		HideProgressCommand hideProgressCommand = new HideProgressCommand();
		mViewCommands.beforeApply(hideProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView view : mViews) {
			view.hideProgress();
		}

		mViewCommands.afterApply(hideProgressCommand);
	}

	@Override
	public  void highlightConfirmButton() {
		HighlightConfirmButtonCommand highlightConfirmButtonCommand = new HighlightConfirmButtonCommand();
		mViewCommands.beforeApply(highlightConfirmButtonCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView view : mViews) {
			view.highlightConfirmButton();
		}

		mViewCommands.afterApply(highlightConfirmButtonCommand);
	}

	@Override
	public  void closeDialog() {
		CloseDialogCommand closeDialogCommand = new CloseDialogCommand();
		mViewCommands.beforeApply(closeDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView view : mViews) {
			view.closeDialog();
		}

		mViewCommands.afterApply(closeDialogCommand);
	}

	@Override
	public  void showMessage(@android.support.annotation.StringRes int resId) {
		ShowMessageCommand showMessageCommand = new ShowMessageCommand(resId);
		mViewCommands.beforeApply(showMessageCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView view : mViews) {
			view.showMessage(resId);
		}

		mViewCommands.afterApply(showMessageCommand);
	}

	@Override
	public  void logSuccessMustInfo() {
		LogSuccessMustInfoCommand logSuccessMustInfoCommand = new LogSuccessMustInfoCommand();
		mViewCommands.beforeApply(logSuccessMustInfoCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView view : mViews) {
			view.logSuccessMustInfo();
		}

		mViewCommands.afterApply(logSuccessMustInfoCommand);
	}


	public class ShowProgressCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView> {
		ShowProgressCommand() {
			super("showProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView mvpView) {
			mvpView.showProgress();
		}
	}

	public class HideProgressCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView> {
		HideProgressCommand() {
			super("hideProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView mvpView) {
			mvpView.hideProgress();
		}
	}

	public class HighlightConfirmButtonCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView> {
		HighlightConfirmButtonCommand() {
			super("highlightConfirmButton", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView mvpView) {
			mvpView.highlightConfirmButton();
		}
	}

	public class CloseDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView> {
		CloseDialogCommand() {
			super("closeDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView mvpView) {
			mvpView.closeDialog();
		}
	}

	public class ShowMessageCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView> {
		public final int resId;

		ShowMessageCommand(@android.support.annotation.StringRes int resId) {
			super("showMessage", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.resId = resId;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView mvpView) {
			mvpView.showMessage(resId);
		}
	}

	public class LogSuccessMustInfoCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView> {
		LogSuccessMustInfoCommand() {
			super("logSuccessMustInfo", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogView mvpView) {
			mvpView.logSuccessMustInfo();
		}
	}
}
