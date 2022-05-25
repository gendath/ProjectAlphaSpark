package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "user_class", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("null")
public class User {
    // Fields

    protected String userName;
    private String password;
    Authority authorityLvl;




    // Constructors
    public User() {
        authorityLvl = Authority.MINIMUM;
        userName = null;
        password = null;
    }

    public User(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

//    @Override
//    public int hashCode() {
//        return getId().intValue();
//    }

    @Override
    public boolean equals(Object obj) {
//        if (obj instanceof User u) return u.getId().longValue() == this.getId().longValue();
//        return false;
        return true;
    }

    // Getters and Setters



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
