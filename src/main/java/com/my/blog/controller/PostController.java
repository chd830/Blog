package com.my.blog.controller;

import com.my.blog.data.Posts;
import com.my.blog.service.EventService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/")
public class PostController {

    @Autowired
    private EventService service;

    @GetMapping("/log")
    public void log() throws Exception {
       log.fatal("FATAL");
       log.error("ERROR");
       log.warn("WARN");
       log.info("INFO");
       log.debug("DEBUG");
       log.trace("TRACE");
    }

//    @PostMapping("/post")
//    public ResponseEntity<List<Posts>> postsList() {
//        return ResponseEntity<service.getEventList()>>
//    }
}
