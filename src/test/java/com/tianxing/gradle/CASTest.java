package com.tianxing.gradle;


import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by tianxing on 17/2/28.
 * CAS(Compare and swap)算法  乐观锁
 */
public class CASTest {

    private AtomicInteger lock = new AtomicInteger(0);

    private boolean set(int i){
        return lock.compareAndSet(4, 0);
    }


}
