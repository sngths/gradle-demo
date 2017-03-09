package com.tianxing.pattern.decorator;

/**
 * Created by tianxing on 2017/3/9.
 * 装饰类的具体实现
 */
public class SideBorder extends Border{
    private char borderChar;

    public SideBorder(Display display, char ch){
        super(display);
        this.borderChar = ch;
    }
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
