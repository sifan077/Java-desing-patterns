package com.sifan;

import java.util.Date;

public class ChatRoom {
    public static String showMessage(User user, String message) {
        return new Date().toString()
                + " [" + user.getName() + "] : " + message;
    }
}