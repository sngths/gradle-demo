package com.tianxing.pattern.mediator;

/**
 * Created by tianxing on 2017/3/14.
 */
public class User {
    private String name;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
