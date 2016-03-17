package com.airhacks.insurance.boundary;

import com.airhacks.insurance.control.InsuranceDataFetcher;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class InsuranceService {

    @Inject
    InsuranceDataFetcher fetcher;

    public String insurances() {
        long amount = fetcher.amount();
        if (amount < 0) {
            throw new IllegalStateException("Amount less than zero!");
        }
        return "vehicle, health " + amount;
    }

}
