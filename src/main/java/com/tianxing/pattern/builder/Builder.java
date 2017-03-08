package com.tianxing.pattern.builder;

/**
 * Created by tianxing on 2017/3/8.
 *
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
