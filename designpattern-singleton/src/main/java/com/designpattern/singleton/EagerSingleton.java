package com.designpattern.singleton;

/**
 * Created by kaiwang on 2017/1/13.
 * ��������ģʽ
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
