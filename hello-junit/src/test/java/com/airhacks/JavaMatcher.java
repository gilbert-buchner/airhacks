package com.airhacks;

import org.hamcrest.CustomMatcher;
import org.hamcrest.Matcher;

/**
 *
 * @author airhacks.com
 */
public class JavaMatcher extends CustomMatcher<String> {

    public JavaMatcher(String description) {
        super(description);
    }

    @Override
    public boolean matches(Object item) {
        if (!(item instanceof String)) {
            return false;
        }
        String value = (String) item;
        return value.contains("java");
    }

    public static Matcher<String> isJavaCompatible() {
        return new JavaMatcher("Should contain java");
    }

}
