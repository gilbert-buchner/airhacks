/*
 */
package com.airhacks.sonar;

/**
 *
 * @author adam-bien.com
 */
public class CrazyComplex {

    public int output(int input) {

        if (input % 2 == 0) {
            return 2;
        } else if (input % 3 == 0) {
            return 3;
        } else if (input % 4 == 0) {
            return 4;
        }
        return 42;
    }

}
