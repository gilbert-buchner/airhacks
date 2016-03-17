package com.airhacks.insurance.boundary;

import com.airhacks.insurance.control.InsuranceDataFetcher;
import com.airhacks.insurance.entity.InsuranceData;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        this.cut.fetcher = mock(InsuranceDataFetcher.class);
    }

    @Test
    public void negativeAmount() {
        when(this.cut.fetcher.amount()).thenReturn(new java.util.ArrayList<>());
        exceptionRule.expect(IllegalStateException.class);
        exceptionRule.expectMessage(containsString("less"));
        this.cut.insurances();
    }

    @Test
    public void validAmount() {
        List<InsuranceData> insurances = new ArrayList<>();
        insurances.add(new InsuranceData(21));
        when(this.cut.fetcher.amount()).thenReturn(insurances);
        String result = this.cut.insurances();
        assertThat(result, containsString(","));
    }

}
