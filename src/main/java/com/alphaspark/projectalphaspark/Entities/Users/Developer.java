package com.alphaspark.projectalphaspark.Entities.Users;


import com.alphaspark.projectalphaspark.Entities.Comment;
import com.alphaspark.projectalphaspark.Entities.Commentable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Developer")
public class Developer extends Employee{

    // TODO: 6/1/22 Add note via interface 'notable'

}
