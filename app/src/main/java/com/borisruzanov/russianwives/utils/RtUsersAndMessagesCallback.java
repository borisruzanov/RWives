package com.borisruzanov.russianwives.utils;

import com.borisruzanov.russianwives.models.Message;
import com.borisruzanov.russianwives.models.RtUser;

import java.util.List;

public interface RtUsersAndMessagesCallback {

    void setRtUsersAndMessages(List<RtUser> rtUserList, List<Message> messageList);

}
