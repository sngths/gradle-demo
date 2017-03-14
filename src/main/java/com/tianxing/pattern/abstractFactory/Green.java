package com.tianxing.pattern.abstractFactory;

/**
 * Created by tianxing on 2017/3/14.
 */
public class Green implements  Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
