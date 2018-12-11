package com.greenfoxacademy.demowebshop;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebshopController {

    ShopItemList shopItemList2 = new ShopItemList();
    @PostConstruct
    public void setUp(){
        shopItemList2.fillUpDefaultstuff();
    }

    @RequestMapping("/webshop")
    public String webShop(Model model) {
        model.addAttribute("shoppingList", shopItemList2);
        return "webshop";
    }

    @RequestMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("shoppingList", shopItemList2.getOnlyAvailable());
        return "webshop";
    }

    @RequestMapping("/get-most-expensive")
    public String getMostExpensive(Model model) {
        ShopItem shopItem2 = shopItemList2.getMostexpensive();
        model.addAttribute("mostexpensive", shopItem2);
        return "get-most-expensive";
    }

    @RequestMapping("/has-nike")
    public String hasnike(Model model) {
        model.addAttribute("hasnike", shopItemList2.getNike());
        return "hasnike";
    }

    @RequestMapping("/cheapest")
    public String getCheapest(Model model) {
        model.addAttribute("cheapest", shopItemList2.cheapestFirst());
        return "cheapest";
    }

    @RequestMapping("/average-stock")
    public String getAverage(Model model) {
        model.addAttribute("averagestock", shopItemList2.getAverageStock());
        return "average_stock";
    }

    @RequestMapping("/search")
    public String getAverage(@RequestParam("input") String name, Model model) {
        model.addAttribute("searchresult",  shopItemList2.searchResult(name));
        return "search";
    }
}
