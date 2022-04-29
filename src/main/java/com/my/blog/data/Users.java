package com.my.blog.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    private Long id;
    private String firstName;
    private int age;
    private String email;

    // getters and setters
}