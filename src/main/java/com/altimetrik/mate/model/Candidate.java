package com.altimetrik.mate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO: Describe purpose and behavior of Candidate
 */
public class Candidate {
    
       
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("age")
    private int age;
    
    @JsonProperty("experience")
    private Experience experience;
    
    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Candidate [name=" + name + ", age=" + age + ", experience=" + experience + ", email=" + email
                + ", phone=" + phone + "]";
    }
 
    
}
