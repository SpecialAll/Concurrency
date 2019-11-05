package com.zxh.concurrency.example.publish.singleton;

import com.zxh.concurrency.annoations.ThreadSafe;
import com.zxh.concurrency.annoations.ThreadUnSafe;

/**
 * 单例模式
 * 懒汉模式:双重检验锁方式实现单例模式
 *
 * 但不是线程安全的，原因是可能发生指令重排
 *
 *
 * 所以为了避免发生指令重排，就使用volatile！！！！
 *
 *
 */
@ThreadSafe
public class SingletonExample5 {
    //私有构造函数
    private SingletonExample5(){}

    //单利对象
    //添加volatile来阻止指令重排
    private static volatile SingletonExample5 instance = null;

    /**
     * 1、memory = allocate（）分配对象的内存空间
     * 2、ctorInstance（） 初始化对象
     * 3、instance = memory 设置instance指向刚分配的内存
     */

    //JVM 和 CPU 会发生指令重排

    /**
     * 指令重排就会出现一下结果：
     * 1、memory = allocate（）分配对象的内存空间
     * 3、instance = memory 设置instance指向刚分配的内存
     * 2、ctorInstance（） 初始化对象
     */

    //静态工厂方法
    public static SingletonExample5 getInstance(){

        if(instance == null){
            synchronized (SingletonExample1.class){   //同步锁
                if(instance == null){
                    instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }
}
