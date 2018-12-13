package com.exampledependencies.demoexampledependencies;

import com.exampledependencies.demoexampledependencies.Models.Blue;
import com.exampledependencies.demoexampledependencies.Models.MyColor;
import com.exampledependencies.demoexampledependencies.Services.Printer;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoexampledependenciesApplication implements CommandLineRunner {
    Printer printer;
    MyColor blue;

    @Autowired
    public DemoexampledependenciesApplication(Printer printer, MyColor blue) {
        this.printer = printer;
        this.blue = blue;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoexampledependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Do this stuff");
        blue.printColor();
    }
}

