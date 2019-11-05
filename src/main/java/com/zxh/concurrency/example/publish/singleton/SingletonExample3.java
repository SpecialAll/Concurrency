package com.zxh.concurrency.example.publish.singleton;

import com.zxh.concurrency.annoations.ThreadUnSafe;
import com.zxh.concurrency.annoations.UnRecommend;

/**
 * 单例模式
 * 懒汉模式 ： 线程安全操作 ，加synchronize
 */
@ThreadUnSafe
@UnRecommend
public class SingletonExample3 {
    //私有构造函数
    private SingletonExample3(){}

    //单利对象
    private static SingletonExample3 instance = null;

    //静态工厂方法
    public static synchronized SingletonExample3 getInstance(){
        if(instance == null){
            instance = new SingletonExample3();
        }
        return instance;
    }
}
