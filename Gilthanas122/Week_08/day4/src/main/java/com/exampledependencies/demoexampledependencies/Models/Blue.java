package com.exampledependencies.demoexampledependencies.Models;

import com.exampledependencies.demoexampledependencies.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public class Blue implements MyColor {
     private String color;
     @Autowired
     Printer printer;

    public Blue() {
        this.color = "blue";
    }

    @Override
    public void printColor() {
       printer.log("It is" + this.color +  " in color...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
