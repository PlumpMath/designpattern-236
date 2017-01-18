package com.designpattern.singleton;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * EagerSingleton Tester.
 *
 * @author <kaiwangac>
 * @version 1.0
 * @since <pre>01/13/2017</pre>
 */
public class EagerSingletonTest {

    /**
     * Method: getInstance()
     */
    @Test
    public void testGetInstance() throws Exception {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        Assert.assertSame(instance1, instance2);
    }
}
