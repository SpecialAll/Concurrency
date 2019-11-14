package com.zxh.concurrency.threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        Thread thread1 = new Thread(futureTask,"a");
        Thread thread2 = new Thread(futureTask,"b");

        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName()+"----------");
        System.out.println(futureTask.get());
    }
}
