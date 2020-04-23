package com.arellomobile.mvp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoxyReflector {

	private static Map<Class<?>, Object> sViewStateProviders;
	private static Map<Class<?>, List<Object>> sPresenterBinders;
	private static Map<Class<?>, Object> sStrategies;

	static {
		sViewStateProviders = new HashMap<>();
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.actions.ActionsPresenter.class, new com.borisruzanov.russianwives.mvp.ui.actions.ActionsPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter.class, new com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessagePresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter.class, new com.borisruzanov.russianwives.mvp.ui.chats.ChatsPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogPresenter.class, new com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfilePresenter.class, new com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfilePresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.main.MainPresenter.class, new com.borisruzanov.russianwives.mvp.ui.main.MainPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogPresenter.class, new com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfilePresenter.class, new com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfilePresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoPresenter.class, new com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter.class, new com.borisruzanov.russianwives.mvp.ui.search.SearchPresenter$$ViewStateProvider());
		
		sPresenterBinders = new HashMap<>();
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.actions.ActionsFragment.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.actions.ActionsFragment$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.chats.ChatsFragment$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.filter.FilterDialogFragment$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.friendprofile.FriendProfileActivity$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.main.MainActivity.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.main.MainActivity$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.myprofile.MyProfileActivity$$PresentersBinder()));
		sPresenterBinders.put(com.borisruzanov.russianwives.mvp.ui.search.SearchFragment.class, Arrays.<Object>asList(new com.borisruzanov.russianwives.mvp.ui.search.SearchFragment$$PresentersBinder()));
		
		sStrategies = new HashMap<>();
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class, new com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy());
	}
	
	public static Object getViewState(Class<?> presenterClass) {
		ViewStateProvider viewStateProvider = (ViewStateProvider) sViewStateProviders.get(presenterClass);
		if (viewStateProvider == null) {
			return null;
		}
		
		return viewStateProvider.getViewState();
	}

	public static List<Object> getPresenterBinders(Class<?> delegated) {
		return sPresenterBinders.get(delegated);
	}

	public static Object getStrategy(Class<?> strategyClass) {
		return sStrategies.get(strategyClass);
	}
}
