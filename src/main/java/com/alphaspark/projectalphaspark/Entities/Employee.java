package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends BaseUser {

    private Long employeeNum;

    public Employee() {
        authorityLvl = Authority.EMPLOYEE;
    }

    public Employee(String userName, String password) {
        super(userName, password);
        authorityLvl = Authority.EMPLOYEE;
    }
}
