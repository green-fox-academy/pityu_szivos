package com.redditproject.demoreddigproject.Controller;

import com.redditproject.demoreddigproject.Models.Post;
import com.redditproject.demoreddigproject.Repositories.PostRepository;
import com.redditproject.demoreddigproject.Services.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class RedditController implements CommandLineRunner {
    RedditService redditService;
    PostRepository postRepository;

    @Autowired
    public RedditController(RedditService redditService, PostRepository postRepository) {
        this.redditService = redditService;
        this.postRepository = postRepository;
    }

    @GetMapping("/index")
    public String indexGet(Model model){
        model.addAttribute("redditposts",redditService.topPost());
        return "index";
    }
    @PostMapping("/{id}/votedown")
    public String voteDown(@PathVariable("id") Long id){
       redditService.saveToPostRepository(redditService.setLikeCounterDown(id));
        return "redirect:/index";
    }

    @PostMapping("/{id}/voteup")
    public String voteUp(@PathVariable("id") Long id){
        redditService.saveToPostRepository(redditService.setLikeCounterUp(id));
        return "redirect:/index";
    }

    @GetMapping("/addpost")
    public String addItemGet(Model model, @ModelAttribute (name= "post") Post post){
        model.addAttribute("post", post);
        return "addpost";
    }

    @PostMapping("/addpost")
    public String addItemPost(@ModelAttribute (name = "post") Post post){
        redditService.saveToPostRepository(post);
        return "redirect:/index";
    }

    @Override
    public void run(String... args) throws Exception {
        Post post = new Post("My new post", "https://www.newpost.com");
        Post post2 = new Post("This is the second", "https://www.thesecond.com");
        postRepository.save(post);
        postRepository.save(post2);

    }
}
