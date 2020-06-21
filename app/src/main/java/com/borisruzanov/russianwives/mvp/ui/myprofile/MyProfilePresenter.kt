package com.borisruzanov.russianwives.mvp.ui.myprofile

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.borisruzanov.russianwives.UserProfileItemsList
import com.borisruzanov.russianwives.eventbus.VisitsEvent
import com.borisruzanov.russianwives.eventbus.UserEvent
import com.borisruzanov.russianwives.models.UserDescriptionModel
import com.borisruzanov.russianwives.mvp.model.interactor.myprofile.MyProfileInteractor
import com.borisruzanov.russianwives.utils.ActionsCountInfoCallback
import com.borisruzanov.russianwives.utils.UserCallback
import com.borisruzanov.russianwives.utils.UserHideCallback
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

import java.util.ArrayList
import javax.inject.Inject

@InjectViewState
class MyProfilePresenter @Inject constructor(private val interactor: MyProfileInteractor) : MvpPresenter<MyProfileView>() {
    private val userDescriptionList = ArrayList<UserDescriptionModel>()
    private var mUid ="" //store the uid of current user

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        setAllCurrentUserInfo()
        setActionsCount()
    }

    fun setAllCurrentUserInfo() {
        interactor.getAllCurrentUserInfo(UserCallback{ fsUser ->
            viewState.setUserData(fsUser.name, fsUser.age, fsUser.country, fsUser.image)
            userDescriptionList.addAll(UserProfileItemsList.initData(fsUser))
            viewState.setList(userDescriptionList)
            EventBus.getDefault().post(UserEvent(fsUser))

            mUid=fsUser.uid //initialize the current user uid
        })
    }

    private fun setActionsCount() {
        interactor.getActionsCountInfo(
                ActionsCountInfoCallback{ visits, likes -> viewState.setActionsCount(visits, likes) })
    }

    @Subscribe
    fun updateActionsCount(event: VisitsEvent){
        viewState.setActionsCount(event.getmVisits(), event.getmLikes())
    }


    fun registerSubscribers() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this)
        }
    }

    fun unsubscribe(){
        EventBus.getDefault().unregister(this)
    }


    /**
     * calling a changeUserHideStatus method of MyProfileInteractor
     * @param callback a callback after successfully change hideStatus
     */
    fun setUserHideStatus(callback: UserHideCallback){
        interactor.changeUserHideStatus(mUid,true,callback)
    }
}
