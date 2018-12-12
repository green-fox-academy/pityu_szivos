package com.thymeleafpractice.demothymeleafpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "hello";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "outcome";
    }

    @RequestMapping(
            value = "/ex/foos",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public String getFoosAsJsonFromREST() {
        return "Get some Foos with Header New";
    }

    @RequestMapping(value = "/ex/foos2/{id}", method = GET)                     // Get data from path
    @ResponseBody
    public String getFoosBySimplePathWithPathVariable(
            @PathVariable String id) {
        return "Get a specific Foo with id=" + id;
    }

    @RequestMapping(value = "/ex/foos3/{fooid}/bar/{barid}", method = GET)          // Get multiple data from Path
    @ResponseBody
    public String getFoosBySimplePathWithPathVariables
            (@PathVariable long fooid, @PathVariable long barid) {
        return "Get a specific Bar with id=" + barid +
                " from a Foo with id=" + fooid;
    }

    @RequestMapping(value = "/ex/foos4/bars", method = GET)
    @ResponseBody
    public String getBarBySimplePathWithRequestParam(
            @RequestParam("id") long id) {
        return "Get a specific Bar with id=" + id;
    }

    @RequestMapping(
            value = "/ex/foos5/bars",
            params = { "id", "second" },
            method = GET)
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParams(
            @RequestParam("id") long id, @RequestParam ("second") long second) {
        return "Narrow Get a specific Bar with id=" + id + second;
    }

    @RequestMapping(                                                    //Multiple Path
            value = { "/ex/advanced/bars", "/ex/advanced/foos" },
            method = GET)
    @ResponseBody
    public String getFoosOrBarsByPath() {
        return "Advanced - Get some Foos or Bars";
    }

    @RequestMapping(                                                // Multiple Method
            value = "/ex/foos/multiple",
            method = { RequestMethod.PUT, RequestMethod.POST }
    )
    @ResponseBody
    public String putAndPostFoos() {
        return "Advanced - PUT and POST within single method";
    }

}
