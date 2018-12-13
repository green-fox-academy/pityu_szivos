package com.exampledependencies.demoexampledependencies.Models;

import com.exampledependencies.demoexampledependencies.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Green implements MyColor {
    @Autowired
    Printer printer;
    private String color;

    public Green() {
        this.color = "green";
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
