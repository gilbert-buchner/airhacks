package com.airhacks.logger.boundary;

import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author airhacks.com
 */
public class FakeLogClient {

    @Inject
    Logger LOG;

    public Logger getLOG() {
        return LOG;
    }
}
