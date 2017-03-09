package com.tianxing.pattern;

import com.tianxing.pattern.decorator.Display;
import com.tianxing.pattern.decorator.FullBorder;
import com.tianxing.pattern.decorator.SideBorder;
import com.tianxing.pattern.decorator.StringDisplay;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/9.
 * 装饰模式
 */
public class DecoratorTest {


    @Test
    public void test() {
        Display b1 = new StringDisplay("Hello");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Display b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("Hello")), '*'
                                )
                        )
                ), '/');

        b4.show();
    }
}
