package com.tianxing.gradle;


import org.junit.Test;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by tianxing on 17/2/28.
 * CAS(Compare and swap)算法  乐观锁
 */
public class CASTest {

    private AtomicInteger count1 = new AtomicInteger(100);
    private AtomicInteger count2 = new AtomicInteger(100);
    private Random random = new Random();

    @Test
    public void test() {
        Thread task1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {
                    int num = random.nextInt(10);
                    if (count1.get() >= 10) {
                        count1.addAndGet(-num);
                        count2.addAndGet(num);
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        });

        Thread task2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {
                    int num = random.nextInt(10);
                    if (count2.get() >= 10) {
                        count1.addAndGet(num);
                        count2.addAndGet(-num);
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        });

        Thread task3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {
                    System.out.println(count1.get() + "  " + count2.get() + "  " + (count1.get() + count2.get()));
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        return;
                    }

                }
            }
        });


        task1.start();
        task2.start();
        task3.start();


        for (; ; ) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                task1.interrupt();
                task2.interrupt();
                task3.interrupt();
                return;
            }
        }
    }


}
