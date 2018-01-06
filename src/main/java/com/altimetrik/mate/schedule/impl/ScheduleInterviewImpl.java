package com.altimetrik.mate.schedule.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.altimetrik.mate.model.Candidate;
import com.altimetrik.mate.model.Link;
import com.altimetrik.mate.model.ScheduleDetail;
import com.altimetrik.mate.schedule.ScheduleInterview;


@Component
@Scope("request")
public class ScheduleInterviewImpl implements ScheduleInterview {

    List<ScheduleDetail> scheduleDetailList=new ArrayList<>();
    
    public static final String ALTI_API_PREFIX = "/v1/manage/schedule/get?id=";


    @Override
    public Response schedule(ScheduleDetail c) {
        scheduleDetailList.add(c);
        Link link = new Link();
        link.setHref(ALTI_API_PREFIX + c.getCandidateId());
        Response build = Response.ok(link).build();
        return build;    
      }

}
