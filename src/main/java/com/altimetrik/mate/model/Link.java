package com.altimetrik.mate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO: Describe purpose and behavior of Link
 */
public class Link {

    @JsonProperty("href")
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    
}
