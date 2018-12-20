package com.foxclub.demofoxclub.Controller;

import com.foxclub.demofoxclub.Models.Fox;
import com.foxclub.demofoxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
    FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

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
        foxService.addFox(new Fox(name));
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/nutrition-store")
    public String nutritionStoreFoodDrink(Model model, @RequestParam ("name") String name){
        model.addAttribute("fox", foxService.returnFox(name));
        return "nutritionstore";
    }

    @PostMapping("/nutrition-store")
    public String nutritionStoreFoodDring(Model model, @RequestParam("fox") Fox fox){
        model.addAttribute("name", fox.getName());
        return "redirect:/index";
    }

}
