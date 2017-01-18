package com.designpattern.strategy.sample02;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Calculator Tester.
 *
 * @author <kaiwangac>
 * @version 1.0
 * @since <pre>01/09/2017</pre>
 */
public class CalculatorTest {

    /**
     * test add
     */
    @Test
    public void testAdd() throws Exception {
        Operator operator = new Operator(Calculator.ADD);
        Assert.assertEquals(3, operator.operate(1, 2));
    }

    /**
     * test sub
     */
    @Test
    public void testSub() throws Exception {
        Operator operator = new Operator(Calculator.SUB);
        Assert.assertEquals(1, operator.operate(2, 1));
    }
}
