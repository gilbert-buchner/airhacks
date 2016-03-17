/*
 */
package com.airhacks.sonar;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author adam-bien.com
 */
@Ignore
public class CrazyComplexTest {

    private CrazyComplex cut;

    @Before
    public void init() {
        this.cut = new CrazyComplex();
    }

    @Test
    public void output() {
        this.cut.output(1);
        this.cut.output(2);
        this.cut.output(3);
        this.cut.output(4);
    }

}
