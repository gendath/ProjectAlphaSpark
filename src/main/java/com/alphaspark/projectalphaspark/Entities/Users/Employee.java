package com.alphaspark.projectalphaspark.Entities.Users;

import com.alphaspark.projectalphaspark.Entities.Users.BaseUser;
import com.alphaspark.projectalphaspark.Enums.Authority;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends BaseUser {

    // TODO: 5/31/2022 add fields: Projects
    // TODO: 5/31/2022 make sales/dev sub Entities 

    private Long employeeNum;

    public Employee() {
        authorityLvl = Authority.EMPLOYEE;
    }

    public Employee(String userName, String password) {
        super(userName, password);
        authorityLvl = Authority.EMPLOYEE;
    }
}
