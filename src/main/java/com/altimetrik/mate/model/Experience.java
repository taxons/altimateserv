package com.altimetrik.mate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO: Describe purpose and behavior of Experience
 */
public class Experience {
    
    @JsonProperty("years")
    private int years;
    
    @JsonProperty("month")
    private int month;
    
    public Experience() {
    }
    
    public Experience(int years, int month) {
        this.years = years;
        this.month = month;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    

}
