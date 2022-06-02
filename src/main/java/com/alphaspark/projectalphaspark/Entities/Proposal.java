package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Entities.Users.Client;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Proposal {
    // TODO: 5/31/2022 devNotes,salesNotes, projectDetails, proposedCompletionDate, dateSubmitted, dateApproved, approvedBy, finalAgreement, comments (make new entity)
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;


    @ManyToMany(mappedBy = "proposals")
    private final Set<Client> clients = new HashSet<>();

    public Long getId() {
        return this.id;
    }

    // TODO Need ideas how to use front end design and form to contact us with project proposal

}
