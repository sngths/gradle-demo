package com.tianxing.pattern.proxy;

/**
 * Created by tianxing on 2017/3/13.
 */
public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
