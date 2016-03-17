package com.airhacks.insurance.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("insurances")
public class InsurancesResource {

    @GET
    public String insurances() {
        return "vehicle";
    }

}
