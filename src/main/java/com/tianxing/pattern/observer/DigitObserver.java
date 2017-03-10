package com.tianxing.pattern.observer;

/**
 * Created by tianxing on 2017/3/10.
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            Thread.interrupted();
        }
    }
}
