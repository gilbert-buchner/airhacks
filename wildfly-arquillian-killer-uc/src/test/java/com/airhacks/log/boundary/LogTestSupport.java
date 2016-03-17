/*
 */
package com.airhacks.log.boundary;

import javax.inject.Inject;

/**
 *
 * @author adam-bien.com
 */
public class LogTestSupport {

    @Inject
    Log log;

    public Log getLog() {
        return log;
    }
}
