package com.alphaspark.projectalphaspark.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proposal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    // Fields
    private Long id;

    private String name;

// TODO Need ideas how to use front end design and form to contact us with project proposal

}
