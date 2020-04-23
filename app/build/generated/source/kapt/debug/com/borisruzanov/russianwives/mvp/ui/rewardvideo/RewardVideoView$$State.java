package com.borisruzanov.russianwives.mvp.ui.rewardvideo;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class RewardVideoView$$State extends MvpViewState<com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoView> implements com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoView {

	@Override
	public  void showCoinsCount( int coins) {
		ShowCoinsCountCommand showCoinsCountCommand = new ShowCoinsCountCommand(coins);
		mViewCommands.beforeApply(showCoinsCountCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoView view : mViews) {
			view.showCoinsCount(coins);
		}

		mViewCommands.afterApply(showCoinsCountCommand);
	}


	public class ShowCoinsCountCommand extends ViewCommand<com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoView> {
		public final int coins;

		ShowCoinsCountCommand( int coins) {
			super("showCoinsCount", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.coins = coins;
		}

		@Override
		public void apply(com.borisruzanov.russianwives.mvp.ui.rewardvideo.RewardVideoView mvpView) {
			mvpView.showCoinsCount(coins);
		}
	}
}
