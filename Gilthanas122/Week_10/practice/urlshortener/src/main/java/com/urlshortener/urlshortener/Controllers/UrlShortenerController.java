package com.urlshortener.urlshortener.Controllers;

import com.urlshortener.urlshortener.Services.MyDataException;
import com.urlshortener.urlshortener.Models.User;
import com.urlshortener.urlshortener.Services.UrlShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.EmptyStackException;

@Controller
public class UrlShortenerController {
    UrlShortenerService urlShortenerService;
    Boolean unique;
    Integer counter;
    MyDataException myDataException;

    @Autowired
    public UrlShortenerController(UrlShortenerService urlShortenerService) {
        this.urlShortenerService = urlShortenerService;
        this.myDataException = myDataException;
        unique = false;
        counter = 0;
        myDataException = new MyDataException("Uh-uh something went wrong");
    }

    @GetMapping("/index")
    public String defaultIndex(Model model, @ModelAttribute("user") User user) {
        model.addAttribute("user", user);
        model.addAttribute("unique", unique);
        model.addAttribute("counter", counter);
        return "index";
    }

    @PostMapping("/save-link")
    public String saveAlias(Model model, @ModelAttribute("user") User user) {
        counter++;
        if (urlShortenerService.saveAlias(user) == null){
            unique = false;
            model.addAttribute("unique", unique);
            return "index";
        }
        unique = true;
        urlShortenerService.saveAlias(user);
        return "index";
    }

    @GetMapping("/a/{aliasValue}")
    public String showUserData(Model model, @PathVariable("aliasValue") String aliasValue){
        if (urlShortenerService.findByAliasValueContains(aliasValue) == null){
            throw  new MyDataException("Uh-uh shit gone wrong");
        }
        model.addAttribute("users", urlShortenerService.findByAliasValueContains(aliasValue));
        return "hitcount";
    }
}
