package com.tianxing.pattern.visitor;

/**
 * Created by tianxing on 2017/3/9.
 */
public interface Element {
    void accept(Visitor visitor);
}
