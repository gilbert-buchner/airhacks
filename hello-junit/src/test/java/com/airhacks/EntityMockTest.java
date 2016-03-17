package com.airhacks;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author airhacks.com
 */
public class EntityMockTest {

    @Test
    public void userName() {
        String first = "erik";
        String second = "adam";
        User user = mock(User.class);
        when(user.getUserName()).thenReturn(first, second);

        assertThat(user.getUserName(), is(first));
        assertThat(user.getUserName(), is(second));
    }

}
