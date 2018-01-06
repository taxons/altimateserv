package com.altimetrik.mate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScheduleDetail {
	
    @JsonProperty("candidateId")
	private String candidateId;
    
    @JsonProperty("interviewerId")
	private String interviewerId;

    @JsonProperty("hrId")
    private String hrId;

    @JsonProperty("date")
    private String date;

    @JsonProperty("type")
    private String type;

    @JsonProperty("interviewLevel")
    private String interviewLevel;

    @JsonProperty("scheduleId")
    private String scheduleId;

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId;
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInterviewLevel() {
        return interviewLevel;
    }

    public void setInterviewLevel(String interviewLevel) {
        this.interviewLevel = interviewLevel;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }
    
    
}
