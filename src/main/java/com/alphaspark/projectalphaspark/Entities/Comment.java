package com.alphaspark.projectalphaspark.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Comment implements Commentable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userComment;


}
