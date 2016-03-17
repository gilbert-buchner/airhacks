/*
 */
package com.airhacks.log.boundary;

/**
 *
 * @author adam-bien.com
 */
public class Log {

    private String name;

    public Log(String name) {
        this.name = name;
    }

    public void log(String msg) {
        System.out.println("Msg from: " + msg);
    }

    public String getName() {
        return name;
    }

}
