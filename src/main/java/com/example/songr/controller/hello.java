package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class hello {
    @GetMapping("/")
    public String base(Model model) {
        model.addAttribute("intro", "hello my friend");
        return "index";
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "developer") String name,
                            Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/capitalize/{name}")


    public String getClassInformation(@PathVariable String name, Model model) {
        model.addAttribute("name", name.toUpperCase());
        return "hello_capitalized";
    }


}
