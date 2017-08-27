package com.chatRobot.service;

import com.chatRobot.model.User;

/**
 * Created by Administrator on 2017/08/27/0027.
 */
public interface IUserService {

    User selectUser(long userId);
}
