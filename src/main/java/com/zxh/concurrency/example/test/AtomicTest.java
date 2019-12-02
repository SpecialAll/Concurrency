package com.zxh.concurrency.example.test;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @version 1.0
 * @Author ningque
 * @Date 2019/12/1
 *
 * 多线程开十个线程，每个线程打印出一到十，10个数字；
 */
public class AtomicTest {
//    public static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<10; i++){
            new Thread(){
                public AtomicInteger count = new AtomicInteger(1);
                @Override
                public void run() {
                    for(int j=0; j<10; j++){
                        System.out.println(count.getAndIncrement());

                    }
                }
            }.start();
        }
//        Thread.sleep(1000);
//        System.out.println(count);
        
    }
}
