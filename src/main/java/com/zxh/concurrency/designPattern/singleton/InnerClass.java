package com.zxh.concurrency.designPattern.singleton;

/**
 * @version 1.0
 * @Author ningque
 * @Date 2019/11/28
 *
 * 内部类实现
 */
public class InnerClass {
    public static class singleton{
        private static InnerClass instance = new InnerClass();
    }

    private InnerClass(){}

    public static InnerClass getInstance(){
        return singleton.instance;
    }
}
