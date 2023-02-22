package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex() {
        return "index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsShow(@PathVariable long id) {
        return "viewling post at id " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreate() {
        return "create post form";
    }

    @PostMapping("/posts/create")
    public void createPost() {

    }
}