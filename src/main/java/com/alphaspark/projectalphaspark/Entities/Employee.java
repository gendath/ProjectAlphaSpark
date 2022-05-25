package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@DiscriminatorValue("Employee")
public class Employee extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long employeeNum;

    public Employee() {
        authorityLvl = Authority.EMPLOYEE;
    }

    public Employee(String userName, String password) {
        super(userName, password);
        authorityLvl = Authority.EMPLOYEE;
    }
}
