package com.tianxing.pattern.prototype;

/**
 * Created by tianxing on 2017/3/8.
 *
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
