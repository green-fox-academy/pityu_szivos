package com.redditproject.demoreddigproject;

import com.redditproject.demoreddigproject.Models.Post;
import com.redditproject.demoreddigproject.Repositories.PostRepository;
import com.redditproject.demoreddigproject.Services.RedditService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class DemoreddigprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoreddigprojectApplication.class, args);
    }
}

