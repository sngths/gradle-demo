package com.tianxing.pattern;

import com.tianxing.pattern.state.SafeFrame;

/**
 * Created by tianxing on 2017/3/10.
 * 状态模式
 */
public class StateTest {

    static SafeFrame frame = new SafeFrame("title");

    //@Test
    public static void main(String[] args) {
        for (; ; ) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
