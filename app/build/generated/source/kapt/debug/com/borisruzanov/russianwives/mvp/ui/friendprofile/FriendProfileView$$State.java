package com.borisruzanov.russianwives.mvp.ui.friendprofile;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class FriendProfileView$$State extends MvpViewState<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> implements com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView {

	@Override
	public  void setFriendData( java.lang.String name,  java.lang.String age,  java.lang.String country,  java.lang.String image) {
		SetFriendDataCommand setFriendDataCommand = new SetFriendDataCommand(name, age, country, image);
		mViewCommands.beforeApply(setFriendDataCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView view : mViews) {
			view.setFriendData(name, age, country, image);
		}

		mViewCommands.afterApply(setFriendDataCommand);
	}

	@Override
	public  void setList( java.util.List<com.borisruzanov.russianwives.models.UserDescriptionModel> userDescriptionList) {
		SetListCommand setListCommand = new SetListCommand(userDescriptionList);
		mViewCommands.beforeApply(setListCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView view : mViews) {
			view.setList(userDescriptionList);
		}

		mViewCommands.afterApply(setListCommand);
	}

	@Override
	public  void openRegDialog() {
		OpenRegDialogCommand openRegDialogCommand = new OpenRegDialogCommand();
		mViewCommands.beforeApply(openRegDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView view : mViews) {
			view.openRegDialog();
		}

		mViewCommands.afterApply(openRegDialogCommand);
	}

	@Override
	public  void setLikeHighlighted() {
		SetLikeHighlightedCommand setLikeHighlightedCommand = new SetLikeHighlightedCommand();
		mViewCommands.beforeApply(setLikeHighlightedCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView view : mViews) {
			view.setLikeHighlighted();
		}

		mViewCommands.afterApply(setLikeHighlightedCommand);
	}

	@Override
	public  void openChatMessage( java.lang.String name,  java.lang.String image) {
		OpenChatMessageCommand openChatMessageCommand = new OpenChatMessageCommand(name, image);
		mViewCommands.beforeApply(openChatMessageCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView view : mViews) {
			view.openChatMessage(name, image);
		}

		mViewCommands.afterApply(openChatMessageCommand);
	}

	@Override
	public  void showMustInfoDialog() {
		ShowMustInfoDialogCommand showMustInfoDialogCommand = new ShowMustInfoDialogCommand();
		mViewCommands.beforeApply(showMustInfoDialogCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView view : mViews) {
			view.showMustInfoDialog();
		}

		mViewCommands.afterApply(showMustInfoDialogCommand);
	}

	@Override
	public  void openSlider( java.util.ArrayList<java.lang.String> sliderList) {
		OpenSliderCommand openSliderCommand = new OpenSliderCommand(sliderList);
		mViewCommands.beforeApply(openSliderCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView view : mViews) {
			view.openSlider(sliderList);
		}

		mViewCommands.afterApply(openSliderCommand);
	}


	public class SetFriendDataCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
		public final java.lang.String name;
		public final java.lang.String age;
		public final java.lang.String country;
		public final java.lang.String image;

		SetFriendDataCommand( java.lang.String name,  java.lang.String age,  java.lang.String country,  java.lang.String image) {
			super("setFriendData", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.name = name;
			this.age = age;
			this.country = country;
			this.image = image;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView mvpView) {
			mvpView.setFriendData(name, age, country, image);
		}
	}

	public class SetListCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
		public final java.util.List<com.borisruzanov.russianwives.models.UserDescriptionModel> userDescriptionList;

		SetListCommand( java.util.List<com.borisruzanov.russianwives.models.UserDescriptionModel> userDescriptionList) {
			super("setList", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.userDescriptionList = userDescriptionList;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView mvpView) {
			mvpView.setList(userDescriptionList);
		}
	}

	public class OpenRegDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
		OpenRegDialogCommand() {
			super("openRegDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView mvpView) {
			mvpView.openRegDialog();
		}
	}

	public class SetLikeHighlightedCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
		SetLikeHighlightedCommand() {
			super("setLikeHighlighted", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView mvpView) {
			mvpView.setLikeHighlighted();
		}
	}

	public class OpenChatMessageCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
		public final java.lang.String name;
		public final java.lang.String image;

		OpenChatMessageCommand( java.lang.String name,  java.lang.String image) {
			super("openChatMessage", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.name = name;
			this.image = image;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView mvpView) {
			mvpView.openChatMessage(name, image);
		}
	}

	public class ShowMustInfoDialogCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
		ShowMustInfoDialogCommand() {
			super("showMustInfoDialog", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView mvpView) {
			mvpView.showMustInfoDialog();
		}
	}

	public class OpenSliderCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView> {
		public final java.util.ArrayList<java.lang.String> sliderList;

		OpenSliderCommand( java.util.ArrayList<java.lang.String> sliderList) {
			super("openSlider", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.sliderList = sliderList;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileView mvpView) {
			mvpView.openSlider(sliderList);
		}
	}
}
