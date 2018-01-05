package com.altimetrik.mate.endpoint;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.altimetrik.mate.model.Candidate;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * TODO: Describe purpose and behavior of CandidateDetails
 */
@Path("/candidate")
@Consumes(
{ "application/json" })
@Produces(
{ "application/json" })
public interface CandidateDetails {

    @POST
    @Path("/add")
    public Response add(Candidate c);

    @GET
    @Path("/search")
    public Response search(@QueryParam("email") String email, @QueryParam("phone") String phone,
            @QueryParam("id") String id) throws JsonProcessingException;

    @GET
    @Path("/get")
    public Response get(@QueryParam("id") String id) throws JsonProcessingException;

    @GET
    @Path("/getAll")
    public Response getAll() throws JsonProcessingException;

}
