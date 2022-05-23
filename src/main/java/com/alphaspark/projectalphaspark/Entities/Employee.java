package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends User{

    private Long employeeNum;

    public Employee() {
        authorityLvl = Authority.EMPLOYEE;
    }

    public Employee(String userName, String password) {
        super(userName, password);
        authorityLvl = Authority.EMPLOYEE;
    }
}
