package com.tianxing.pattern.strategy;

/**
 * Created by tianxing on 2017/3/9.
 * 策略接口
 */
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
