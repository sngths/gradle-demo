package com.tianxing.pattern.adapter;

/**
 * Created by tianxing on 2017/3/8.
 * 使用现有实现 实现现有需求
 */
public class PrintBanner2 implements Print{
    private Banner banner;
    public PrintBanner2(String string){
        this.banner = new Banner(string);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
