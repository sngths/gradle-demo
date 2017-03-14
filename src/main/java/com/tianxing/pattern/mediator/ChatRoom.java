package com.tianxing.pattern.mediator;

import java.util.Date;

/**
 * Created by tianxing on 2017/3/14.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
