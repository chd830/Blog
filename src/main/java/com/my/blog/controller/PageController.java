package com.my.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/draganddrop")
    public String drag() {
        return "draganddrop";
    }

    @GetMapping("/index")
    public String idx() {
        return "index";
    }

    @GetMapping("/")
    public String main() {
        return "main";
    }
}
