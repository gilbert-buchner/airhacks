package com.airhacks;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author airhacks.com
 */
public class HelloTestRule implements TestRule {

    public static HelloTestRule create() {
        return new HelloTestRule();
    }

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("Before: " + description.getMethodName());
                if (description.getAnnotation(Sunny.class) != null) {
                    System.out.println(" skipping method: " + description.getMethodName());
                    return;
                }
                base.evaluate();
                System.out.println("After: " + description.getMethodName());
            }
        };

    }

}
