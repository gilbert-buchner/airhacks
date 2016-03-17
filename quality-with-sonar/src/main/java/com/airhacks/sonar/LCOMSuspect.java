package com.airhacks.sonar;

/**
 *
 * @author airhacks.com
 */
public class LCOMSuspect {

    private int first;
    private int last;

    public boolean validateFirst() {
        return this.first > 0;
    }

    public boolean validateLast() {
        return this.last > 0;
    }
}
