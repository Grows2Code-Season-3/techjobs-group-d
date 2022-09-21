package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Location extends AbstractEntity{
@OneToMany
@JoinColumn(name="location_id")
    private List<Job> jobs = new ArrayList<>();

    public Location() {}

    public List<Job> getJobs() {
        return jobs;
    }
}
