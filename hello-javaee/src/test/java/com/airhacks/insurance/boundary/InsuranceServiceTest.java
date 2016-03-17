package com.airhacks.insurance.boundary;

import com.airhacks.insurance.control.InsuranceDataFetcher;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author airhacks.com
 */
public class InsuranceServiceTest {

    InsuranceService cut;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void init() {
        this.cut = new InsuranceService();
        this.cut.fetcher = new InsuranceDataFetcher();
    }

    @Test
    public void negativeAmount() {
        exceptionRule.expect(IllegalStateException.class);
        exceptionRule.expectMessage(containsString("negative"));
        this.cut.insurances();
    }

}
