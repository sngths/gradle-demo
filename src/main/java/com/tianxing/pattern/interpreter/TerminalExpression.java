package com.tianxing.pattern.interpreter;

/**
 * Created by tianxing on 2017/3/14.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }


    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
