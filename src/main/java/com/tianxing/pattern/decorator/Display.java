package com.tianxing.pattern.decorator;

/**
 * Created by tianxing on 2017/3/9.
 *
 */
public abstract class Display {
    public abstract int getColumns();//列数
    public abstract int getRows();//行数
    public abstract String getRowText(int row);


    public final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
