package com.tianxing.pattern;

import com.tianxing.pattern.mediator.User;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/14.
 * 中介者模式
 */
public class MediatorTest {

    @Test
    public void test(){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
