package com.tianxing.pattern.iterator;

/**
 * Created by tianxing on 2017/3/8.
 * 迭代器接口 用于遍历集合中的元素
 */
public interface Iterator {

    boolean hasNest();

    Object next();
}
