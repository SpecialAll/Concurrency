package com.zxh.concurrency.example.publish.singleton;

import com.zxh.concurrency.annoations.Recommend;
import com.zxh.concurrency.annoations.ThreadSafe;

/**
 * 单例模式
 * 枚举模式 : 最安全
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {
    //私有构造函数
    private SingletonExample7() {
    }

    //静态工厂方法
    public static SingletonExample7 getInstance() {
        return Singleton.INSTANCE.getSingleton();
    }

    private  enum Singleton{
        INSTANCE;

        private SingletonExample7 singleton;

        //JVM保证只执行一次
        Singleton(){
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getSingleton() {
            return singleton;
        }
    }
}
