package com.alphaspark.projectalphaspark.Entities;

import javax.persistence.*;

@Entity
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    // Fields
    private Long id;

    private String name;

// TODO Find a way perhaps to add a comment section for each individual project and for clients to make a proposal to add or remove
//  features - proposal should also have a comment section for conversation between employees and clients.

// TODO @ManyToMany(cascade = ??) Help us Perry can not figure out how to safely ignore the json




}
