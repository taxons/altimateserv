package com.altimetrik.mate.endpoint.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;

import com.altimetrik.mate.endpoint.CandidateDetails;
import com.altimetrik.mate.model.Candidate;

/**
 * TODO: Describe purpose and behavior of CandidateDetailsImpl
 */
public class CandidateDetailsImpl implements CandidateDetails {
    
    private List<Candidate> listCandidate=new ArrayList<>();

    @Override
    public Response add(Candidate c) {
        listCandidate.add(c);
        Link link = new Link();
        return null;
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
