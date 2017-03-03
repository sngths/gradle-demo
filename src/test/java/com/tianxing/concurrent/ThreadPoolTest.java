package com.tianxing.concurrent;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by tianxing on 17/3/3.
 *
 */
public class ThreadPoolTest {

    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());//线程池

    @Test
    public void test(){
        threadPoolExecutor.hashCode();
    }
}
