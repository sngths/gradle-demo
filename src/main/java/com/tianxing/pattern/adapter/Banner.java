package com.tianxing.pattern.adapter;

/**
 * Created by tianxing on 2017/3/8.
 * 现有实现
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
