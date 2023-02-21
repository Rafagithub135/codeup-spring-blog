package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/posts")
public String postsIndex() {
        return "index page";
    }

    @GetMapping("/posts/{id}")
public String postsShow() {
        return "show post";
    }

    @GetMapping("/posts/create")
public String postsCreate() {
        return "create post form";
    }
}
