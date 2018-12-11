package com.greenfoxacademy.demowebshop;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class ShopItemList implements Serializable {
      private List<ShopItem> shopItemList;

    public ShopItemList() {
        shopItemList = new ArrayList<>();
    }

    public void fillUpDefaultstuff(){
        shopItemList.add(new ShopItem("running shoes", "this nike is good to run in it and is fancy", 100, 5));
        shopItemList.add(new ShopItem("running shoes", "this nike is good to run in it and is fancy", 100, 5));
        shopItemList.add(new ShopItem("black trouses", "dark and pricey like everything in this shop", 80, 0));
        shopItemList.add(new ShopItem("black trouses", "dark and pricey like everything in this shop", 80, 0));
        shopItemList.add(new ShopItem("black trouses", "dark and pricey like everything in this shop", 80, 0));
        shopItemList.add(new ShopItem("leather gloves", "made from bear skin", 150, 1));
        shopItemList.add(new ShopItem("leather gloves", "made from bear skin", 150, 1));
    }

    public ShopItem getMostexpensive(){
        return Collections.max(shopItemList, (entry1, entry2) -> entry1.getPrice() - entry2.getPrice());
    }

    public List <ShopItem> getOnlyAvailable(){
        return shopItemList.stream().filter(item -> item.getQuantity()!= 0).collect(Collectors.toList());
    }

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public List <ShopItem> getNike(){
        return shopItemList.stream()
                .filter(item -> item.getName().contains("nike") || item.getDescription().contains("nike"))
                .collect(Collectors.toList());
    }

    public List <ShopItem> cheapestFirst(){
       shopItemList.sort(Comparator.comparing(o -> o.getPrice()));
        return shopItemList;
    }

    public String getAverageStock(){
        int average = shopItemList.stream()
                .filter(o -> o.getQuantity()>0)
                .mapToInt(o -> o.getQuantity()).sum() / shopItemList.size();
        return Integer.toString(average);
    }

    public List <ShopItem> searchResult(String name){
      return shopItemList.stream()
                .filter(o -> o.getDescription().contains(name) || o.getName().contains(name)).collect(Collectors.toList());
    }
}
