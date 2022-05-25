package com.alphaspark.projectalphaspark.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Proposal {
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "proposals")
    private final Set<Client> clients = new HashSet<>();

    // TODO Need ideas how to use front end design and form to contact us with project proposal

}
