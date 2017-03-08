package com.tianxing.pattern.adapter;

/**
 * Created by tianxing on 2017/3/8.
 * 适配器角色 继承了现有实现 实现了现有需求
 */
public class PrintBanner1 extends Banner implements Print{

    public PrintBanner1(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
