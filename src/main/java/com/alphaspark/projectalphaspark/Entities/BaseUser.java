package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_class", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("null")
public class BaseUser {
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    protected String userName;
    private String password;
    protected Authority authorityLvl;

    // Constructors
    public BaseUser() {
        authorityLvl = Authority.MINIMUM;
        userName = null;
        password = null;
    }

    public BaseUser(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

    @Override
    public int hashCode() {
        return getId().intValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseUser) {
            BaseUser u = (BaseUser) obj;
            return u.getId().longValue() == this.getId().longValue();
        }
        return false;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authority getAccessLvl() {
        return authorityLvl;
    }

    public void setAccessLvl(Authority authorityLvl) {
        this.authorityLvl = authorityLvl;
    }

}
