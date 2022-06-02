package com.alphaspark.projectalphaspark.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalesNote implements Notable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId;
    // Will consider fields and mapping

}
