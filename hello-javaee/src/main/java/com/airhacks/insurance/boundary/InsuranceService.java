package com.airhacks.insurance.boundary;

import com.airhacks.insurance.control.InsuranceDataFetcher;
import com.airhacks.insurance.entity.InsuranceData;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * See: http://www.adam-bien.com/roller/abien/entry/how_to_reuse_java_ee for
 * hard to test business logic
 *
 * @author airhacks.com
 */
@Stateless
public class InsuranceService {

    @Inject
    private InsuranceDataFetcher fetcher;

    public String insurances() {
        List<InsuranceData> amount = fetcher.amount();
        if (amount.isEmpty()) {
            throw new IllegalStateException("Amount less than zero!");
        }
        return "vehicle, health " + amount;
    }

}
