package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(max=500)
    public String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    //Setters and Getters

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    //No arg Constructor
    public Skill(){}
}