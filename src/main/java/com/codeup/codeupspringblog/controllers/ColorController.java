package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {
    @GetMapping("/color")
    public String colorForm() {
        return "color";
    }

    @PostMapping("/color")
    public String FavoriteColor(@RequestParam(name = "color") String color) {
        return String.format("Your favorite color is %s", color);
    }
}
