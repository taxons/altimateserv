package com.altimetrik.mate.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * TODO: Describe purpose and behavior of Echo
 */
@Path("/echo")
@Component
public class Echo {

    @GET
    @Consumes({ MediaType.TEXT_PLAIN })
    @Produces({ MediaType.APPLICATION_JSON })
    public String echo() {
        return "{\"name\":\"joshi\"}";
    }

}
