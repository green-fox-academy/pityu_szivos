package com.greenfoxacademy.demowebshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class WebshopController {

    @RequestMapping("/")
    public String cssAdd() {
        return "Webshop";
    }

    @RequestMapping("/webshop")
    public String webShop(Model model) {
        ShopItemList shopItemList2 = new ShopItemList();
        shopItemList2.fillUpDefaultstuff();

        model.addAttribute("shoppingList", shopItemList2);
        return "Webshop";
    }

    @RequestMapping("/only-available")
    public String onlyAvailable(Model model) {
        ShopItemList shopItemList2 = new ShopItemList();
        shopItemList2.fillUpDefaultstuff();
        model.addAttribute("shoppingList", shopItemList2.getOnlyAvailable());
        return "only-available";
    }

    @RequestMapping("/get-most-expensive")
    public String getMostExpensive(Model model) {
        ShopItemList shopItemList2 = new ShopItemList();
        shopItemList2.fillUpDefaultstuff();
        ShopItem shopItem2 = shopItemList2.getMostexpensive();
        model.addAttribute("mostexpensive", shopItem2);
        return "get-most-expensive";
    }

    @RequestMapping("/has-nike")
    public String hasnike(Model model) {
        ShopItemList shopItemList2 = new ShopItemList();
        shopItemList2.fillUpDefaultstuff();
        model.addAttribute("hasnike", shopItemList2.getNike());
        return "hasnike";
    }

    @RequestMapping("/cheapest")
    public String getCheapest(Model model) {
        ShopItemList shopItemList2 = new ShopItemList();
        shopItemList2.fillUpDefaultstuff();
        model.addAttribute("cheapest", shopItemList2.cheapestFirst());
        return "cheapest";
    }

    @RequestMapping("/average-stock")
    public String getAverage(Model model) {
        ShopItemList shopItemList2 = new ShopItemList();
        shopItemList2.fillUpDefaultstuff();
        model.addAttribute("averagestock", shopItemList2.getAverageStock());
        return "average_stock";
    }

    @PostMapping("/search")
    public String getAverage(@RequestParam("input") String name, Model model) {
        ShopItemList shopItemList2 = new ShopItemList();
        shopItemList2.fillUpDefaultstuff();
        shopItemList2.searchResult(name);
        model.addAttribute("searchresult",  shopItemList2.searchResult(name));
        return "search";
    }
}
