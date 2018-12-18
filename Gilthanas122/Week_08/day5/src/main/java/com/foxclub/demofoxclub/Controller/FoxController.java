package com.foxclub.demofoxclub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    @PostMapping("/index")
    public String showIndex(Model model, String name){
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String showLogin(Model model, String name){
        model.addAttribute("name", name);
        return "login";
    }

    @PostMapping("/login")
    public String showLoginPost(Model model, @RequestParam("name") String name){
        model.addAttribute("name", name);
        return "index";
    }
}
