package com.designpattern.strategy.sample01;


/**
 * Created by kaiwang on 2017/1/9.
 */
public class Operator {
    private Calculator calculator;

    public Operator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int operate(int a, int b) {
        return this.calculator.execute(a, b);
    }
}
