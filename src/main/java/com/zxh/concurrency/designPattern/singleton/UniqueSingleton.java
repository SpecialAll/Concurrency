package com.zxh.concurrency.designPattern.singleton;

/**
 * @version 1.0
 * @Author ningque
 * @Date 2019/11/28
 *
 * 双重检验加锁实现
 */
public class UniqueSingleton {
    public static volatile UniqueSingleton singleton = null;

    public UniqueSingleton(){}

    public UniqueSingleton getSingleton(){
        if(singleton == null){
            synchronized (UniqueSingleton.class){
                if(singleton == null){
                    singleton = new UniqueSingleton();
                }
            }
        }
        return singleton;
    }
}
