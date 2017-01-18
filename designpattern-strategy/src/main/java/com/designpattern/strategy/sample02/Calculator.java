package com.designpattern.strategy.sample02;

/**
 * Created by kaiwang on 2017/1/9.
 * ²ßÂÔÃ¶¾Ù
 */
public enum Calculator {
    ADD {
        @Override
        public int execute(int a, int b) {
            return a + b;
        }
    },
    SUB {
        @Override
        public int execute(int a, int b) {
            return a - b;
        }
    };

    public abstract int execute(int a, int b);
}
