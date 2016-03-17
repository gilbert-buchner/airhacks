package com.airhacks.insurance.boundary;

import com.airhacks.insurance.control.InsuranceDataFetcher;
import com.airhacks.insurance.entity.InsuranceData;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author airhacks.com
 */
@RunWith(MockitoJUnitRunner.class)
public class InsuranceServiceTest {

    @InjectMocks
    InsuranceService cut;

    @Mock
    InsuranceDataFetcher fetcher;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void negativeAmount() {
        when(fetcher.amount()).thenReturn(new java.util.ArrayList<>());
        exceptionRule.expect(IllegalStateException.class);
        exceptionRule.expectMessage(containsString("less"));
        this.cut.insurances();
    }

    @Test
    public void validAmount() {
        List<InsuranceData> insurances = new ArrayList<>();
        insurances.add(new InsuranceData(21));
        when(fetcher.amount()).thenReturn(insurances);
        String result = this.cut.insurances();
        assertThat(result, containsString(","));
    }

}
