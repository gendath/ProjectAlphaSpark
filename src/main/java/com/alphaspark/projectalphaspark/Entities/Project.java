package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Entities.Users.Client;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {

    // TODO: 5/31/2022 add fields:  comments (make new entity), projectDetails, devNotes, salesNotes, promisedCompletionDate, projectedCompletionDate, milestones (Entity) , totalCost, hostingPackage (Entity), paidToDate,pointOfContact, status, contract
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


}
