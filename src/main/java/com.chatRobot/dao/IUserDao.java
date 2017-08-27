package com.chatRobot.dao;

import com.chatRobot.model.User;

/**
 * Created by Administrator on 2017/08/27/0027.
 */
public interface IUserDao {

    User selectUser(long id);
}
