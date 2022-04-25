package com.my.blog.controller;

import com.my.blog.data.SessionUser;
import com.my.blog.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PageController {

    @Autowired
    private PostsService postsService;
    @Autowired
    private HttpSession httpSession;

    @GetMapping("/draganddrop")
    public String drag() {
        return "draganddrop";
    }

    @GetMapping("/index")
    public String idx() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("posts", postsService.getPostsList("test"));
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if(user != null)
            model.addAttribute("userName", user.getName());
        return  "login";
    }
    @GetMapping("/")
    public String main() {
        return "main";
    }
}
