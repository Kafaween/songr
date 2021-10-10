package com.example.songr.controller;

import com.example.songr.model.albums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

    @GetMapping("/albums")
    public String album( Model model) {
       albums a1=new albums("My Beautiful Dark Twisted Fantasy","kanye west",5,500,"https://upload.wikimedia.org/wikipedia/en/thumb/b/be/MBDTF_ALT.jpg/220px-MBDTF_ALT.jpg");
        albums a2=new albums("My ","kanye west",5,50000,"https://image.shutterstock.com/image-vector/retro-covers-set-colorful-modernism-260nw-465537599.jpg");
        albums a3=new albums("My asd","kanye west",10,5000,"https://image.shutterstock.com/image-vector/retro-covers-set-colorful-modernism-260nw-465537599.jpg");
        ArrayList<albums> albumms= new ArrayList<>();
        albumms.add(a1);
        albumms.add(a2);
        albumms.add(a3);
        model.addAttribute("albumm", albumms);
        return "albums";
    }
}
