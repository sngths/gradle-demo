package com.tianxing.pattern.Bridge;

/**
 * Created by tianxing on 2017/3/8.
 * 类的功能层次和实现层次的 桥梁
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
