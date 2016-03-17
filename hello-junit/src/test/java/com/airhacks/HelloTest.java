package com.airhacks;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
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
        assertThat(actual, both(containsString("hello")).
                and(containsString("world")));
    }

}
