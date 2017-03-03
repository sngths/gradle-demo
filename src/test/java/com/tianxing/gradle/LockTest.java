package com.tianxing.gradle;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tianxing on 17/2/27.
 *
 */
public class LockTest {

    private final Object lock = new Object();
    private String string = "aa";
    private ReentrantLock reentrantLock = new ReentrantLock();


    private Executor executor = Executors.newScheduledThreadPool(5);
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);


    private int count = 0;


    @Test
    public void test() {
        Thread remove = new Thread(new Task1());
        Thread add = new Thread(new Task2());
        remove.setDaemon(false);
        add.setDaemon(false);
        remove.start();
        add.start();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                add.interrupt();
                remove.interrupt();
                System.out.println("关闭");
            }
        }));

        for (; ; ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }


    @Test
    public void test2(){

        reentrantLock.lock();
        try{

        }finally {
            reentrantLock.unlock();
        }
    }


    private class Task1 implements Runnable {

        @Override
        public void run() {
            for (; ; ) {
                synchronized (lock) {
                    while (count >= 100) {
                        count = count - 100;
                        System.out.println("减去100后:" + count);
                    }
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Task1关闭");
                        return;
                    }
                }ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>(50);
            }

        }
    }


    private class Task2 implements Runnable {
        private Random random = new Random();
        private int r = 0;

        @Override
        public void run() {
            for (; ; ) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Task2关闭");
                    return;
                }
                synchronized (lock) {
                    r = random.nextInt(300);
                    count = count + r;
                    System.out.println("加上" + r + "等于" + count);
                    lock.notify();
                }
            }

        }
    }


}
