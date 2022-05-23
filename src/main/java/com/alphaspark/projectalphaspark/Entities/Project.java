package com.alphaspark.projectalphaspark.Entities;

import javax.persistence.*;

@Entity
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    // Fields
    private Long id;

    private String name;


// TODO @ManyToMany(cascade = ??) Help us Perry can not figure out how to safely ignore the json




}
