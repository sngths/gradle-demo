package com.tianxing.pattern.decorator;

/**
 * Created by tianxing on 2017/3/9.
 * 装饰类
 */
public abstract class Border extends Display{
    Display display;//被装饰物
    Border(Display display){
        this.display = display;
    }
}
