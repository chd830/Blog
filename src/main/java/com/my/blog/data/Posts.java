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
    private String _id;
    private int postNo;
    private String category;
    private String subject;
    private String content;
    private String registerDate;
    private String updateDate;

    @Override
    public String toString() {
        return "Posts{" +
                "_id='" + _id + '\'' +
                ", postNo=" + postNo +
                ", category='" + category + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
