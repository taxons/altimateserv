package com.altimetrik.mate.schedule;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.altimetrik.mate.model.ScheduleDetail;

@Path("/schedule")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public interface ScheduleInterview {

    @POST
    public Response schedule(ScheduleDetail c);
}
