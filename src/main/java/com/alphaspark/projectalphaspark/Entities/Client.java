package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

import java.util.ArrayList;
import java.util.List;

public class Client extends User{
    // Fields
    private List<Proposal> proposals;


    // Constructors

    public Client() {
        authorityLvl = Authority.CLIENT;
        proposals = new ArrayList<>();
    }

    public Client(String userName, String password) {
        super(userName, password);
        authorityLvl = Authority.CLIENT;
        proposals = new ArrayList<>();
    }

}
