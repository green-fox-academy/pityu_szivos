package com.springbootpractice.bootpractice;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List <Book> getAllBook(){
        return Arrays.asList((
                new Book(11, "mastering spring boot", "me")
                ));
    }

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello world";
    }


    @GetMapping("/hello-world2")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-path")
    public HelloWorldBean helloWorldPath(@RequestParam String name){
        return new HelloWorldBean(String.format(("Hello World, %s", name));
    }
}
