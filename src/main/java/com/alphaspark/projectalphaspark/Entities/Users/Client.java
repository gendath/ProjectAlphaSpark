package com.alphaspark.projectalphaspark.Entities.Users;

import com.alphaspark.projectalphaspark.Entities.Project;
import com.alphaspark.projectalphaspark.Entities.Proposal;
import com.alphaspark.projectalphaspark.Entities.Users.BaseUser;
import com.alphaspark.projectalphaspark.Enums.Authority;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("Client")
public class Client extends BaseUser {

    // TODO: 5/31/2022 add fields :  lastVisited, lastContact, bestContactTimes, devNotes, salesNotes
    // Fields
    @ManyToMany
    @JoinTable(name = "proposal_clients", joinColumns = @JoinColumn(name="client_id"), inverseJoinColumns = @JoinColumn(name = "proposal_id"))
    private Set<Proposal> proposals;

    @ManyToMany
    @JoinTable(name = "project_clients", joinColumns = @JoinColumn(name="client_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private final Set<Project> projects;


    // Constructors

    public Client() {
        authorityLvl = Authority.CLIENT;
        proposals = new HashSet<>();
        projects = new HashSet<>();
    }

    public Client(String userName, String password) {
        super(userName, password);
        authorityLvl = Authority.CLIENT;
        proposals = new HashSet<>();
        projects = new HashSet<>();
    }
    public Set<Project> getProjects() {
        return projects;
    }

    public void addProjects(Project project) {
        this.projects.add(project);
    }

    public void removeProject(Project project) {
        this.projects.remove(project);
    }
}
