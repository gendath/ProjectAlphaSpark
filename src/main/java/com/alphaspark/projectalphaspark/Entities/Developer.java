package com.alphaspark.projectalphaspark.Entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("Developer")
public class Developer extends Employee{

    // TODO: 6/1/22 Add note via interface 'notable'


    private Commentable comment = new Comment();
}
