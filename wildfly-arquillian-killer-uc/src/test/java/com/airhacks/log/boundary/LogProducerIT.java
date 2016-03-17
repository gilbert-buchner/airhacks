/*
 */
package com.airhacks.log.boundary;

import javax.inject.Inject;
import static org.hamcrest.CoreMatchers.is;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author adam-bien.com
 */
@RunWith(Arquillian.class)
public class LogProducerIT {

    @Inject
    LogTestSupport lts;

    @Deployment
    public static JavaArchive create() {
        return ShrinkWrap.create(JavaArchive.class).
                addClasses(Log.class, LogProducer.class, LogTestSupport.class).
                addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void logConfiguration() {
        Log log = lts.getLog();
        assertNotNull(log);
        String name = log.getName();
        assertNotNull(name);
        assertThat(log.getName(), is(lts.getClass().getName()));
    }

}
