package com.tianxing.pattern.abstractFactory;

/**
 * Created by tianxing on 2017/3/14.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
