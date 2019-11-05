package com.zxh.concurrency.example.publish.singleton;

import com.zxh.concurrency.annoations.ThreadSafe;
import com.zxh.concurrency.annoations.ThreadUnSafe;

/**
 * 单例模式
 * 饿汉模式 : 线程安全
 */
@ThreadSafe
public class SingletonExample2 {
    //私有构造函数
    private SingletonExample2(){}

    //单利对象
    private static SingletonExample2 instance = new SingletonExample2();

    //静态工厂方法
    public static SingletonExample2 getInstance(){

        return instance;
    }
}
