package com.greenfoxacademy.rueppelli.seadog.springintrohelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pet {
       private String petName;
       public int age;

    public Pet() {
        this.petName = "Pet";
        this.age = 12;
    }
    @RequestMapping("/pet")
    public String getName() {
        return "name: " +petName + " age: " + age;
    }

}
