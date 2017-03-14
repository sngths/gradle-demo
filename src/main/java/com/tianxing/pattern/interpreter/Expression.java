package com.tianxing.pattern.interpreter;

/**
 * Created by tianxing on 2017/3/14.
 */
public interface Expression {
    boolean interpret(String context);
}
