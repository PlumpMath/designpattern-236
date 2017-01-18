package com.designpattern.strategy.sample01.impl;

import com.designpattern.strategy.sample01.Calculator;

/**
 * Created by kaiwang on 2017/1/9.
 */
public class Sub implements Calculator {
    public int execute(int a, int b) {
        return a - b;
    }
}
