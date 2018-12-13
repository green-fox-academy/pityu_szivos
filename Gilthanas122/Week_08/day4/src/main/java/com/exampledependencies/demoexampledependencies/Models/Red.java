package com.exampledependencies.demoexampledependencies.Models;

import com.exampledependencies.demoexampledependencies.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Red implements MyColor {
    private String color;
    @Autowired
    Printer printer;

    public Red() {
        this.color = "red";
    }

    @Override
    public void printColor() {
      printer.log("It is " + this.color +  " in color...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
