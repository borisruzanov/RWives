package com.borisruzanov.russianwives.mvp.model.interactor.myprofile

import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository
import com.borisruzanov.russianwives.utils.ActionsCountInfoCallback
import com.borisruzanov.russianwives.utils.UserCallback
import com.borisruzanov.russianwives.utils.UserHideCallback
import javax.inject.Inject

class MyProfileInteractor @Inject constructor(private val repository: UserRepository) {

    fun getAllCurrentUserInfo(callback: UserCallback) {
        repository.getAllCurrentUserInfo(callback)
    }

    fun getActionsCountInfo(callback: ActionsCountInfoCallback) {
        repository.getActionsCountInfo(callback)
    }

    //calling UserRepository changeUserHideStatus method
    fun changeUserHideStatus(uid: String,hideStatus:Boolean,hideCallback: UserHideCallback){
        repository.changeUserHideStatus(uid,hideStatus,hideCallback)
    }

}
