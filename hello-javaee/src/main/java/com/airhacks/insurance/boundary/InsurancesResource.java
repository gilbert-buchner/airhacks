package com.airhacks.insurance.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Stateless
@Path("insurances")
public class InsurancesResource {

    @Inject
    InsuranceService service;

    @GET
    public JsonObject insurances() {
        return Json.createObjectBuilder().
                add("type", service.insurances()).
                build();
    }

}
