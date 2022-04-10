package com.my.blog.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Posts {
    @Id
    private int postNo;
    private String category;
    private String subject;
    private String content;
    private String registerDate;
    private String updateDate;
}
