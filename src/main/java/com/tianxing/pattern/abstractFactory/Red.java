package com.tianxing.pattern.abstractFactory;

/**
 * Created by tianxing on 2017/3/14.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
