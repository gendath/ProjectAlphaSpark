package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

import java.util.ArrayList;
import java.util.List;

public class User {
    // Fields
    private Long id = 0L;
    protected String userName;
    private String password;
    protected Authority authorityLvl;
    protected final List<Project> projects;


    // Constructors

    public User() {
        authorityLvl = Authority.MINIMUM;
        userName = null;
        password = null;
        projects = new ArrayList<>();
    }

    public User(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

    @Override
    public int hashCode() {
        return getId().intValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User u) return u.getId().longValue() == this.getId().longValue();
        return false;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authority getAccessLvl() {
        return authorityLvl;
    }

    public void setAccessLvl(Authority authorityLvl) {
        this.authorityLvl = authorityLvl;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProjects(Project project) {
        this.projects.add(project);
    }

    public void removeProject(Project project) {
        this.projects.remove(project);
    }

}
