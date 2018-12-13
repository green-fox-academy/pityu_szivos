package com.bankofsimba.demobankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> clientAnimals;

    public BankController() {
        this.clientAnimals = new ArrayList<>();
        clientAnimals.add(new BankAccount("Simba", 5000, "Lion", true));
        clientAnimals.add(new BankAccount("Pumba", 100, "Boar", false));
        clientAnimals.add(new BankAccount("Timon", 2000, "Weasel", false));
    }

    @RequestMapping("/show")
    public String showAnimal(Model model) {
        model.addAttribute("client", clientAnimals.get(0));
        return "showUserDetails";
    }

    @RequestMapping("/showstuff")
    public String showStuff(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text.");
        model.addAttribute("formattext", "<b>Enjoy yourself!</b>");
        return "showstuff";
    }

    @RequestMapping("/listAnimals")
    public String listAnimals(Model model) {
        model.addAttribute("clients", clientAnimals);
        return "listAnimals";
    }

    @PostMapping("/add")
    public String greetingSubmit(@RequestParam String name) {
        for (BankAccount bankAccount : clientAnimals) {
            if (bankAccount.getName().toLowerCase().equals(name.toLowerCase()) && bankAccount.getKing()) {
                bankAccount.setBalance(bankAccount.getBalance() + 100);
            } else if (bankAccount.getName().toLowerCase().equals(name.toLowerCase())) {
                bankAccount.setBalance(bankAccount.getBalance() + 10);
            }
        }
        return "redirect:/listAnimals";
    }

    @GetMapping(value = "/adduser")
    public String addUserGET(Model model, @ModelAttribute (name = "bankAccount") BankAccount bankAccount) {
        model.addAttribute("bankAccount", bankAccount);
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUserPOST(  @ModelAttribute (name = "bankAccount") BankAccount bankAccount){
        clientAnimals.add(bankAccount);
        return "redirect:/listAnimals";
    }
}
