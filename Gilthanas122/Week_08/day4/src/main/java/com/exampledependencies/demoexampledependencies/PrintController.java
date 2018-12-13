package com.exampledependencies.demoexampledependencies;

import com.exampledependencies.demoexampledependencies.Models.MyColor;
import com.exampledependencies.demoexampledependencies.Services.Printer;
import com.exampledependencies.demoexampledependencies.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.rmi.CORBA.Util;
import java.nio.file.Path;

@Controller
public class PrintController {
    UtilityService utilityService;
    MyColor color;
    String email;
    String text;
    Integer number;

    @Autowired
    public PrintController(MyColor color, UtilityService utilityService) {
        this.color = color;
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String listUtilityServices(String email, Model model, String text, Integer number){
        model.addAttribute("email", email);
        return "main";
    }

    @GetMapping("useful/background")
    public String setBackgroundColor(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "coloredBackground";
    }

    @GetMapping(path="/useful/email")
    public String validateEmail(Model model, @RequestParam String email){
        model.addAttribute("isvalid", utilityService.validateEmail(email));
        model.addAttribute("emailaddress", email);
        return "email";
    }

    @GetMapping("useful/caesar")
    public String caesar(Model model, @RequestParam String text,@RequestParam Integer number){
       model.addAttribute("caesar", utilityService.caesar(text, number));
       return "caesar";
    }

}
