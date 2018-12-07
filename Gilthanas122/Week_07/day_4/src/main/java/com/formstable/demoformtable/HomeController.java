package com.formstable.demoformtable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String register(Model model){
        return "home";
    }

    @GetMapping("/newsletter")
    public String newsletter(){
        return "newsletter";
    }
}
