package com.designpattern.singleton;

/**
 * Created by kaiwang on 2017/1/13.
 * ÀÁººµ¥ÀýÄ£Ê½
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
