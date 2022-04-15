package com.my.blog.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("event")
@Getter
@Setter
public class EventDoc {

    @Id
    private String _id;
    private String title;
    private String image;

    @Override
    public String toString() {
        return "EventDoc{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
