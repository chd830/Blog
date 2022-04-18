package com.my.blog.controller;

import com.my.blog.data.EventDoc;
import com.my.blog.data.Posts;
import com.my.blog.service.EventService;
import com.my.blog.service.PostsService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostsService service;

    @GetMapping("/log")
    public void log() throws Exception {
       log.fatal("FATAL");
       log.error("ERROR");
       log.warn("WARN");
       log.info("INFO");
       log.debug("DEBUG");
       log.trace("TRACE");
    }

    @GetMapping("/getpost")
    public void getPosts(@RequestParam String postNo) {
        try {
            System.out.println(service.getPosts(postNo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/getlist")
    public void getEventList(@RequestParam String category) {
        List<Posts> list = service.getPostsList(category);
        for(Posts d : list)
            System.out.println(d);
    }

    @PostMapping("/insert")
    public void insertEvent(@RequestBody Posts posts) {
        service.insertPosts(posts);
    }
}
