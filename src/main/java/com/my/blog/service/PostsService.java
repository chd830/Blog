package com.my.blog.service;

import com.my.blog.data.EventDoc;
import com.my.blog.data.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostsService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Posts getPosts(String _id) throws Exception {
        Posts post = mongoTemplate.findById(_id, Posts.class);
        return Optional.ofNullable(post).orElseThrow(() -> new Exception("Not found"));
    }

    public List<Posts> getPostsList(String category) {
        Query query = new Query().addCriteria(Criteria.where("category").is(category));
        return mongoTemplate.find(query, Posts.class);
    }

    public Posts insertPosts(Posts body) {
        return mongoTemplate.insert(body);
    }
}
