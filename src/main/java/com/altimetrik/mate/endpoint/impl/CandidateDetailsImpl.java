package com.altimetrik.mate.endpoint.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.altimetrik.mate.endpoint.CandidateDetails;
import com.altimetrik.mate.model.Candidate;
import com.altimetrik.mate.model.Link;

/**
 * TODO: Describe purpose and behavior of CandidateDetailsImpl
 */
@Component
public class CandidateDetailsImpl implements CandidateDetails {
    
    public static final String ALTI_API_PREFIX = "/v1/manage/";

    private List<Candidate> listCandidate=new ArrayList<>();

    @Override
    public Response add(Candidate c) {
        c.setId(System.currentTimeMillis());
        listCandidate.add(c);
        Link link = new Link();
        link.setHref(ALTI_API_PREFIX+c.getId());
        return Response.ok(link).build();
    }

    @Override
    public Response search(String email, String phone, String id) {
        return null;
    }

    @Override
    public Response get(String id) {
        return null;
    }

}
