package com.tianxing.pattern.chainOfResponsibility;

/**
 * Created by tianxing on 2017/3/9.
 */
public class Trouble {
    private int number;

    public Trouble(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
