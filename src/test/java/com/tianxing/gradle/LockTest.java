package com.tianxing.gradle;

import org.junit.Test;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tianxing on 17/2/27.
 *
 */
public class LockTest {

    Object lock = new Object();
    String string = "aa";
    ReentrantLock reentrantLock = new ReentrantLock();



    Executor executor = Executors.newScheduledThreadPool(5);
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);



    @Test
    public void test() throws ExecutionException, InterruptedException {
        reentrantLock.lock();
        reentrantLock.unlock();
        synchronized (string){
            scheduledExecutorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {

                    return null;
                }
            }).get();
        }
    }



    private class Result implements Future<String>{

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return false;
        }

        @Override
        public boolean isCancelled() {
            return false;
        }

        @Override
        public boolean isDone() {
            return false;
        }

        @Override
        public String get() throws InterruptedException, ExecutionException {
            return null;
        }

        @Override
        public String get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }
    }
}
