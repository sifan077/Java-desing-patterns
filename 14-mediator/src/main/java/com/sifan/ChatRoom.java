package com.sifan;

import java.util.Date;

/**
 * 聊天室中介者 - 负责协调用户之间的通信
 */
public class ChatRoom {
    
    public void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}