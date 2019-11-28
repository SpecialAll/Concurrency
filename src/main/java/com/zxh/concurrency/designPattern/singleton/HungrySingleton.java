package com.zxh.concurrency.designPattern.singleton;

/**
 * @version 1.0
 * @Author ningque
 * @Date 2019/11/28
 *
 * 饿汉式单利
 */

public class HungrySingleton {
    public static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){ }

    public static void main(String[] args){
        HungrySingleton ht = HungrySingleton.instance;
    }

}
