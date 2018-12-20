package com.todo.demotodoweek9persistence;

import com.todo.demotodoweek9persistence.Models.Assignee;
import com.todo.demotodoweek9persistence.Models.ToDo;
import com.todo.demotodoweek9persistence.Repository.AssigneeRepository;
import com.todo.demotodoweek9persistence.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller ("/todo")
public class ToDoController implements CommandLineRunner {
    ToDoRepository toDoRepository;
    AssigneeRepository assigneeRepository;

    @Autowired
    public ToDoController(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
        this.toDoRepository = toDoRepository;
        this.assigneeRepository = assigneeRepository;
    }


    @GetMapping(value = {"/list", "/"})
    public String listAll(Model model, @RequestParam (required = false) Boolean done){
            model.addAttribute("repository", toDoRepository.findAll());
        return "index";
    }

    @GetMapping("/list-assignee")
    public String listAllAssignees(Model model){
        model.addAttribute("repository", assigneeRepository.findAll());
        return "list-assignee";
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

    @PostMapping("/{id}/delete-assignee")
    public String deleteAssigneePost(@PathVariable(name = "id") Long id){
       assigneeRepository.deleteById(id);
        return "redirect:/list-assignee";
    }

    @GetMapping("/{id}/edit")
    public String editItemGet(Model model, @PathVariable (name = "id") Long id){
        model.addAttribute("item", toDoRepository.findById(id).get());
        model.addAttribute("assign", assigneeRepository.findAll());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editItemPost(@ModelAttribute (name = "todo") ToDo todo, @ModelAttribute (value="assig") String assig){
        todo.setAssignee(assigneeRepository.findByName(assig));
        toDoRepository.save(todo);
        return "redirect:/list";
    }

    @GetMapping("/{id}/editassignee")
    public String editAssigneeGet(Model model, @PathVariable (name = "id") Long id){
        model.addAttribute("itemassignee", assigneeRepository.findById(id).get());
        return "editassignee";
    }

    @PostMapping("/{id}/editassignee")
    public String editAssigneePost(@ModelAttribute Assignee assignee, @PathVariable Long id){
        assignee.setId(assigneeRepository.findById(id).get().getId());
        assigneeRepository.save(assignee);
        return "redirect:/list-assignee";
    }

    @PostMapping("/search")
    public String searchElements (Model model, @RequestParam("text") String text) {
        model.addAttribute("repository", toDoRepository.findByTitleContainsOrDescriptionContainsOrContentContains(text, text, text));
        return "index";
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("Wash your hair","slow", "slowly"));
        toDoRepository.save(new ToDo("take a shit","some shit", "painfully" ));
        toDoRepository.save(new ToDo("eat the cake", "cheese cake", "is delicious"));
        assigneeRepository.save(new Assignee("john doe", "johndoe@gmail.com"));
        assigneeRepository.save(new Assignee("jane doe", "jane@gmail.com"));
    }
}
