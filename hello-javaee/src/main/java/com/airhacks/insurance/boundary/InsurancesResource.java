package com.airhacks.insurance.boundary;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("insurances")
public class InsurancesResource {

    @GET
    public JsonObject insurances() {
        return Json.createObjectBuilder().add("type", "vehicle").build();
    }

}
