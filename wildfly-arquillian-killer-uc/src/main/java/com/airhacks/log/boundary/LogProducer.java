/*
 */
package com.airhacks.log.boundary;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author adam-bien.com
 */
public class LogProducer {

    @Produces
    public Log create(InjectionPoint ip) {
        Class<?> clazz = ip.getMember().getDeclaringClass();
        return new Log(clazz.getName());
    }

}
