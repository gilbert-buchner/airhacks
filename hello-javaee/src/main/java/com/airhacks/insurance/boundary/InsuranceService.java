package com.airhacks.insurance.boundary;

import javax.ejb.Stateless;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class InsuranceService {

    public String insurances() {
        return "vehicle, health";
    }

}
