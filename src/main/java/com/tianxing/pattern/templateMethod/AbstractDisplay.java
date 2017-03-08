package com.tianxing.pattern.templateMethod;

/**
 * Created by tianxing on 2017/3/8.
 * 只定义抽象方法的具体调用  将具体实现交个子类
 */
public abstract class AbstractDisplay {
    abstract void open();
    abstract void print();
    abstract void close();

    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
