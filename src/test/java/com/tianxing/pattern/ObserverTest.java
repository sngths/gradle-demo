package com.tianxing.pattern;

import com.tianxing.pattern.observer.*;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/10.
 * 观察者模式
 */
public class ObserverTest {

    @Test
    public void test(){
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
