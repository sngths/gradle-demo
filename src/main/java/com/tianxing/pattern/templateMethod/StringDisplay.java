package com.tianxing.pattern.templateMethod;

/**
 * Created by tianxing on 2017/3/8.
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }
    @Override
    void open() {
        printLine();
    }

    @Override
    void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
