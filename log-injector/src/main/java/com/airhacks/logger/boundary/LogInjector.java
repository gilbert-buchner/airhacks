package com.airhacks.logger.boundary;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author airhacks.com
 */
public class LogInjector {

    @Produces
    public Logger expose(InjectionPoint ip) {
        String name = ip.getMember().getDeclaringClass().getName();
        return Logger.getLogger(name);
    }

}
