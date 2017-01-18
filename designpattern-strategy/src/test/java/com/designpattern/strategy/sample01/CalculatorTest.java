package com.designpattern.strategy.sample01;

import com.designpattern.strategy.sample01.impl.Add;
import com.designpattern.strategy.sample01.impl.Sub;
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
        Operator operator = new Operator(new Add());
        Assert.assertEquals(3, operator.operate(1, 2));
    }

    /**
     * test sub
     */
    @Test
    public void testSub() throws Exception {
        Operator operator = new Operator(new Sub());
        Assert.assertEquals(1, operator.operate(2, 1));
    }
}
