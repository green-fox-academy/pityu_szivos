package finder.controller;

import finder.service.UserService;
import finder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {
    UserService service;
    User user;

    @Autowired
    public AppController(UserService service){
        this.service = service;
        this.user = new User();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", user);
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/";
    }
}