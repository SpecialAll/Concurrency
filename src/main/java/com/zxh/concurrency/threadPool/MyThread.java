package com.zxh.concurrency.threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("------call-------");
        return 1024;
    }
}
