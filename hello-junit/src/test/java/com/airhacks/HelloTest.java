package com.airhacks;

import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class HelloTest {

    Hello cut;

    @Before
    public void init() {
        this.cut = new Hello();
    }

    @Test
    public void rightMessage() {
        String actual = this.cut.message();
        assertNotNull(actual);

    }

}
