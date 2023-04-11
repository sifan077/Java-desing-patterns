package com.sifan;

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

    public String sendMessage(String message) {
        return ChatRoom.showMessage(this, message);
    }
}