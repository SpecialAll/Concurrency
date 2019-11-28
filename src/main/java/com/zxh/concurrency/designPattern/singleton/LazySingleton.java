package com.zxh.concurrency.designPattern.singleton;

/**
 * @version 1.0
 * @Author ningque
 * @Date 2019/11/28
 *
 * 懒汉式
 */
public class LazySingleton {
    public static LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
