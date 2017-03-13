package com.tianxing.pattern;

import com.tianxing.pattern.proxy.Printable;
import com.tianxing.pattern.proxy.PrinterProxy;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/13.
 * 代理模式
 */
public class ProxyTest {


    public static void main(String[] args) {
        Printable p = new PrinterProxy("user1");
        System.out.println("现在的名字是:" + p.getPrinterName());
        p.setPrinterName("user2");
        System.out.println("现在的名字是:" + p.getPrinterName());
        p.print("Hello");
    }
}
