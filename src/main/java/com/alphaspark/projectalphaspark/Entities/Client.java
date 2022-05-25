package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Enums.Authority;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("Client")
public class Client extends User{
    // Fields
    @ManyToMany(cascade = CascadeType.ALL)
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
