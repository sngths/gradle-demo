package com.tianxing.pattern;

import com.tianxing.pattern.singleton.Singleton;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/8.
 */
public class SingletonTest {

    @Test
    public void test(){
        System.out.println("Start");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2){
            System.out.println("是相同实例");
        }else {
            System.out.println("不是相同实例");
        }
        System.out.println("End");
    }
}
