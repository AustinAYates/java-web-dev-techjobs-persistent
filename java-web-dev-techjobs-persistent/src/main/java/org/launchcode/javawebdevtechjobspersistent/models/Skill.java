package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")    //NEW
    private List<Job> jobs = new ArrayList<>();

    @Size(max = 100)
    private String description;

    public Skill(@Size(max = 100) String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}