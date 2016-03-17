package com.airhacks.insurance.boundary;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class InsurancesResourceIT {

    private Client client;
    private WebTarget tut;

    @Before
    public void init() {
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8080/hello-javaee/resources/insurances");
    }

    @Test
    public void insurances() {
        Response response = this.tut.request().get();
        assertThat(response.getStatus(), is(200));
        String result = response.readEntity(String.class);
        assertThat(result, is("vehicle"));
        System.out.println("result = " + result);
    }

}
