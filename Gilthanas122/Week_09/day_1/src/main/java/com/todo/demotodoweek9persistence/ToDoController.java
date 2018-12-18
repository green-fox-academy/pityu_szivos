package com.todo.demotodoweek9persistence;

import com.todo.demotodoweek9persistence.Models.ToDo;
import com.todo.demotodoweek9persistence.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller ("/todo")
public class ToDoController implements CommandLineRunner {
    ToDoRepository toDoRepository;

    @Autowired
    public ToDoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    @GetMapping(value = {"/list", "/"})
    public String listAll(Model model, @RequestParam (required = false) Boolean done){
            model.addAttribute("repository", toDoRepository.findAllByDone(true));
        return "index";
    }

    @GetMapping("/additem")
    public String addItemGet(Model model, @ModelAttribute (name= "todo") ToDo toDo){
        model.addAttribute("todo", toDo);
        return "additem";
    }

    @PostMapping("/additem")
    public String addItemPost(@ModelAttribute (name = "todo") ToDo toDo){
        toDoRepository.save(toDo);
        return "redirect:/list";
    }

    @PostMapping("/{id}/deleteitem")
    public String deleteItemGet(@PathVariable(name = "id") Long id){
        toDoRepository.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public String editItemGet(Model model, @PathVariable (name = "id") Long id){
        model.addAttribute("item", toDoRepository.findById(id).get());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editItemPost(@ModelAttribute (name = "todo") ToDo todo, @PathVariable Long id){
        todo.setId(toDoRepository.findById(id).get().getId());
        toDoRepository.save(todo);
        return "redirect:/list";
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("do stuff 1", true, true));
        toDoRepository.save(new ToDo("do stuff2", true, true));
        toDoRepository.save(new ToDo("eat the cake", true, true));
    }
}
