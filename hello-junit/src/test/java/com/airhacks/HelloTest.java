package com.airhacks;

import static com.airhacks.JavaMatcher.isJavaCompatible;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author airhacks.com
 */
public class HelloTest {

    Hello cut;
    List<String> words;

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Rule
    public HelloTestRule rule = HelloTestRule.create();

    @Before
    public void init() {
        this.cut = new Hello();
        this.words = Arrays.asList("java", "javaee", "june");
    }

    @Test
    public void rightMessage() {
        String actual = this.cut.message();
        assertNotNull(actual);
        assertThat(actual, both(containsString("hello")).
                and(containsString("world")));
    }

    @Test
    public void list() {
        assertThat(words, hasItem("java"));
        assertThat(words, both(hasItem("java")).and(hasItem("june")));
        assertThat(words, hasItems("java", "javaee"));
        assertThat(words, everyItem(startsWith("j")));
        assertThat(words, everyItem(not(startsWith(".net"))));
    }

    @Test
    public void customMatcher() {
        assertThat("java", isJavaCompatible());
        //assertThat(".net", new JavaMatcher("should be java compatible"));
    }

    @Test(expected = RuntimeException.class)
    public void exception() {
        this.cut.exceptional();
    }

    @Test
    public void boilerplateExceptionWithMessage() {
        try {
            this.cut.exceptional();
            fail("Expecting exception!");
        } catch (Exception ex) {
            assertTrue(ex instanceof RuntimeException);
            assertThat(ex.getMessage(), both(containsString("unstable")).and(containsString("very")));
        }
    }

    @Test
    public void exceptionWithMessage() {
        this.expected.expect(RuntimeException.class);
        this.expected.expectMessage(
                both(containsString("unstable")).
                and(containsString("very"))
        );
        this.cut.exceptional();
    }

}
