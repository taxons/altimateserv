package com.altimetrik.mate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO: Describe purpose and behavior of Experience
 */
public class Experience {
    
    @JsonProperty("year")
    private int year;
    
    @JsonProperty("month")
    private int month;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    

}
