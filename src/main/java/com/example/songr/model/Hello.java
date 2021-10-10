package com.example.songr.model;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@RequestMapping
public class Hello {
    private String name;

    public String getName() {
        return name;
    }
    public String upper(){
       return this.name.toUpperCase(Locale.ROOT);
    }

    public void setName(String name) {
        this.name = name;
    }
}
