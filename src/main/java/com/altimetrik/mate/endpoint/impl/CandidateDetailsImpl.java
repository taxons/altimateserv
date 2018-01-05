package com.altimetrik.mate.endpoint.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.altimetrik.mate.endpoint.CandidateDetails;
import com.altimetrik.mate.model.Candidate;
import com.altimetrik.mate.model.Link;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * TODO: Describe purpose and behavior of CandidateDetailsImpl
 */
@Component
@Scope("request")
public class CandidateDetailsImpl implements CandidateDetails {
    
    public static final String ALTI_API_PREFIX = "/v1/manage/candidate/get?id=";

    private static List<Candidate> listCandidate=new ArrayList<>();

    @Override
    public Response add(Candidate c) {
        c.setId(System.currentTimeMillis());
        listCandidate.add(c);
        Link link = new Link();
        link.setHref(ALTI_API_PREFIX+c.getId());
        Response build = Response.ok(link).build();
        return build;
    }

    @Override
    public Response search(String email, String phone, String id) throws JsonProcessingException {
        for(Candidate candidate:listCandidate) {
            if(email.equals(candidate.getEmail())) {
                ObjectMapper mapper = new ObjectMapper();
                String jsonInString = mapper.writeValueAsString(candidate);
                return Response.ok(jsonInString).build();
            }
        }
        return Response.status(404).build();
    }

    @Override
    public Response get(String id) throws JsonProcessingException {
        for(Candidate candidate:listCandidate) {
            if(String.valueOf(candidate.getId()).equals(id)) {
                ObjectMapper mapper = new ObjectMapper();
                String jsonInString = mapper.writeValueAsString(candidate);
                return Response.ok(jsonInString).build();
            }
        }
        return Response.status(404).build();
    }

}
