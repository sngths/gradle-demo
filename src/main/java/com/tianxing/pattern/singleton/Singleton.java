package com.tianxing.pattern.singleton;

/**
 * Created by tianxing on 2017/3/8.
 * 单例
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("生成一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
