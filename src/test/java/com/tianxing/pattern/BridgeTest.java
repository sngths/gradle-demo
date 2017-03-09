package com.tianxing.pattern;

import com.tianxing.pattern.Bridge.CountDisplay;
import com.tianxing.pattern.Bridge.Display;
import com.tianxing.pattern.Bridge.StringDisplayImpl;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/9.
 * 桥接模式 连接功能层次结构 和 实现层次结构
 */
public class BridgeTest {

    @Test
    public void test() {
        Display display1 = new Display(new StringDisplayImpl("Hello1"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello2"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello3"));
        display1.display();
        display2.display();
        display3.display();
        display3.multiDisplay(3);
    }
}
