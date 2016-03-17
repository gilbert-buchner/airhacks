package com.airhacks;

import java.time.LocalDate;

/**
 *
 * @author airhacks.com
 */
public class Hello {

    public String message() {
        return "hello world " + LocalDate.now().toString();
    }

}
