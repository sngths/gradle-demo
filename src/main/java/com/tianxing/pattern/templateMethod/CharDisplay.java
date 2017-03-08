package com.tianxing.pattern.templateMethod;

/**
 * Created by tianxing on 2017/3/8.
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(char ch){
        this.ch = ch;
    }

    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(ch);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
