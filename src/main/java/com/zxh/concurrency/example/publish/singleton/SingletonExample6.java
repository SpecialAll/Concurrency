package com.zxh.concurrency.example.publish.singleton;

import com.zxh.concurrency.annoations.ThreadSafe;

/**
 * 单例模式
 * 饿汉模式 : 线程安全
 */
@ThreadSafe
public class SingletonExample6 {
    //私有构造函数
    private SingletonExample6(){}

    /**
     * 注意static代码块和static变量的位置不同结果会不一致
     */
    /*static {
        instance = new SingletonExample6();
    }

    //单利对象
    private static SingletonExample6 instance = null;
*/

    //单利对象
    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }

    //静态工厂方法
    public static SingletonExample6 getInstance(){

        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}
