package com.tianxing.pattern.abstractFactory;

/**
 * Created by tianxing on 2017/3/14.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
