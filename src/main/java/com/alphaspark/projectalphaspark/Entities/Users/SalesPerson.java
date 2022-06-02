package com.alphaspark.projectalphaspark.Entities.Users;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SalesPerson")
public class SalesPerson extends Employee{

// TODO: 6/1/22 Pay structure, commission tracking, sales notes

}
