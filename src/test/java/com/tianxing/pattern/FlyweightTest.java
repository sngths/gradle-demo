package com.tianxing.pattern;

import com.tianxing.pattern.flyweight.BigChar;
import com.tianxing.pattern.flyweight.BigString;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/13.
 * 享元模式
 */
public class FlyweightTest {

    @Test
    public void test(){
        BigString bigString = new BigString("123-561");
        bigString.print();
    }
}
