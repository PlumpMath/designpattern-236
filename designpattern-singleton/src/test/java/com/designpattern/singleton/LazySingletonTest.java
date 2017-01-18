package com.designpattern.singleton;

import junit.framework.Assert;
import org.junit.Test;

/**
 * LazySingleton Tester.
 *
 * @author <kaiwangac>
 * @version 1.0
 * @since <pre>01/13/2017</pre>
 */
public class LazySingletonTest {

    /**
     * Method: getInstance()
     */
    @Test
    public void testGetInstance() throws Exception {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        Assert.assertSame(instance1, instance2);
    }
}
