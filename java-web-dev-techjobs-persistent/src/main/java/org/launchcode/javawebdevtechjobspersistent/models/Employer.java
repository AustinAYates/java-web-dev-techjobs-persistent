package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 25)
    private String location;

    @OneToMany //(mappedBy = "employer")  DIDN'T WORK                  //NEW
    @JoinColumn                                         //NEW
    private final List<Job> jobs = new ArrayList<>();   //NEW

    public Employer(@NotBlank @Size(max = 25) String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }
}
