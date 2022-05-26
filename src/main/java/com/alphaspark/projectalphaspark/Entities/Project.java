package com.alphaspark.projectalphaspark.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;


    @ManyToMany(mappedBy = "projects")
    private final Set<Client> clients = new HashSet<>();

    public Long getId() {
        return id;
    }

    // TODO Find a way perhaps to add a comment section for each individual project and for clients to make a proposal to
    //  add or remove features - proposal should also have a comment section for conversation between employees and clients.

    // TODO @ManyToMany(cascade = ??) Help us Perry can not figure out how to safely ignore the json

}
