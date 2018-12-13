package com.exampledependencies.demoexampledependencies;

import com.exampledependencies.demoexampledependencies.Models.MyColor;
import com.exampledependencies.demoexampledependencies.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrintController {
    @Autowired
    MyColor color;


    @GetMapping("/useful")
    public String listUtilityServices(Model model, MyColor color ){
        model.addAttribute("color",color);
        return "main";
    }
}
