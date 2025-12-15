package com.sifan;

/**
 * 用户类 - 通过中介者与其他用户通信
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 发送消息 - 通过中介者协调
     */
    public void sendMessage(String message, ChatRoom chatRoom) {
        chatRoom.showMessage(this, message);
    }
}