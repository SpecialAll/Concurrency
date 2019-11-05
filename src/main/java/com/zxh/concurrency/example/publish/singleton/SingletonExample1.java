package com.zxh.concurrency.example.publish.singleton;

import com.zxh.concurrency.annoations.ThreadUnSafe;

/**
 * 单例模式
 * 懒汉模式 : 线程不安全
 */
@ThreadUnSafe
public class SingletonExample1 {
    //私有构造函数
    private SingletonExample1(){}

    //单利对象
    private static SingletonExample1 instance = null;

    //静态工厂方法
    public static SingletonExample1 getInstance(){
        if(instance == null){
            instance = new SingletonExample1();
        }
        return instance;
    }
}
