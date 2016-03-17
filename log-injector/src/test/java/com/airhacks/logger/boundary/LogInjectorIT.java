package com.airhacks.logger.boundary;

import java.util.logging.Logger;
import javax.inject.Inject;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author airhacks.com
 */
@RunWith(CdiTestRunner.class)
public class LogInjectorIT {

    @Inject
    FakeLogClient cut;

    @Test
    public void logProperlyConfigured() {
        Logger log = cut.getLOG();
        assertThat(FakeLogClient.class.getName(), is(log.getName()));
    }

}
