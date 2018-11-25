package com.test.core.domain;

public class Singleton {

    // 通过volatile关键字的使用，防止编译器将
    // 1、初始化对象，2、给对象引用赋值
    // 这两步进行重排序
    private static volatile Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
