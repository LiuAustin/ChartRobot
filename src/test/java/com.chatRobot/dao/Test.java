package com.chatRobot.dao;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Administrator on 2017/08/27/0027.
 */
public class Test extends IUserDaoTest{
    public static void main(String[]args) throws Exception {
        Test test=new Test();
        test.testSelectUser();
    }
}
