package com.tianxing.pattern;

import com.tianxing.pattern.adapter.Print;
import com.tianxing.pattern.adapter.PrintBanner1;
import com.tianxing.pattern.adapter.PrintBanner2;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/8.
 */
public class AdapterTest {

    /**
     * 类适配器模式(使用继承的适配器)
     * */
    @Test
    public void test1(){
        Print print = new PrintBanner1("hello");
        print.printWeak();
        print.printStrong();
    }


    /**
     * 对象适配器模式(使用委托的适配器)
     * */
    @Test
    public  void test2(){
        Print print = new PrintBanner2("hello");
        print.printWeak();
        print.printStrong();
    }
}
