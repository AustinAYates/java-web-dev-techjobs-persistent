package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;

//    private String employer;
    @ManyToOne
//    @NotNull(message = "Employer is required")   //WHY DOESN'T IT WORK WITH THIS
    private Employer employer;

//    private String skills; changed every string into a Skill
    @ManyToMany
    @NotNull(message = "At least one skill is required")
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(String anEmployer, List<Skill> someSkills, Employer employer) { //changed someSkills from Skill
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
