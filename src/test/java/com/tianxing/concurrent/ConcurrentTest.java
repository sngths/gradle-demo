package com.tianxing.concurrent;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by tianxing on 17/3/2.
 *
 */
public class ConcurrentTest {

    private ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
    private ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();

    //阻塞列队
    private ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
    private LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();

    //fork/join



    //并发工具类
    private CountDownLatch c = new CountDownLatch(2);




    @Test
    public void countDownLatchTest() throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1执行完成");
                c.countDown();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2执行完成");
                c.countDown();
            }
        }).start();

        //调用countDown达到设定的次数 await停止阻塞
        c.await();
        System.out.println("停止阻塞");
    }




    //同步屏障
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(2);


    @Test
    public void CyclicBarrier() throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1执行完成");
                try {
                    Thread.sleep(2000);
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1退出");
            }
        }).start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2执行完成");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("线程2退出");
            }
        }).start();
        Thread.sleep(3000);
    }



    private Semaphore semaphore = new Semaphore(5);//控制并发线程数

    @Test
    public void semaphoreTest(){
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    Thread.sleep(3000);
                    System.out.println("线程"+ finalI +"执行完成");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    private Exchanger<String> exchanger = new Exchanger<>();//线程间同步交换数据

    @Test
    public void exchangerTest(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(exchanger.exchange("线程1数据"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(exchanger.exchange("线程2数据"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
