package com.greenfoxacademy.rueppelli.seadog.springintrohelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        Name name = new Name("Pityu");
        int randomColor = (int) ((Math.random() * 255 + 1));
        int randomColor2 = (int) ((Math.random() * 255 + 1));
        int randomColor3 = (int) ((Math.random() * 255 + 1));
        String s = Objects.toString(name.getId(), null);
        model.addAttribute("name2", name.getName());
        model.addAttribute("id", s);
        model.addAttribute("randomGreeting", name.returnHellos());
        model.addAttribute("fontSize", name.getFontSize() + "px");
        model.addAttribute("randomColorArray", name.getRandomColor());
        model.addAttribute("randomColor", randomColor);
        model.addAttribute("randomColor2", randomColor2);
        model.addAttribute("randomColor3", randomColor3);
        return "greeting";
    }
}
