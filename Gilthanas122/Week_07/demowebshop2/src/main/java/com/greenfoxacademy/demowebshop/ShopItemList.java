package com.greenfoxacademy.demowebshop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShopItemList implements Serializable {
      private List<ShopItem> shopItemList;

    public ShopItemList() {
        shopItemList = new ArrayList<>();
    }

    public void fillUpDefaultstuff(){
        ShopItem runningShoes = new ShopItem("running shoes", "this nike is good to run in it and is fancy", 100, 5);
        ShopItem trousers = new ShopItem("black trouses", "dark and pricey like everything in this shop", 80, 0);
        ShopItem gloves = new ShopItem("leather gloves", "made from bear skin", 150, 1);
        shopItemList.add(runningShoes);
        shopItemList.add(runningShoes);
        shopItemList.add(runningShoes);
        shopItemList.add(runningShoes);
        shopItemList.add(trousers);
        shopItemList.add(trousers);
        shopItemList.add(trousers);
        shopItemList.add(gloves);
        shopItemList.add(gloves);
        shopItemList.add(gloves);
    }

    public ShopItem getMostexpensive(){
        ShopItem stuff = new ShopItem("stuff","desc", 0, 0);
        for (ShopItem item: shopItemList) {
            if (item.getPrice() > stuff.getPrice()){
                stuff = item;
            }
        }
        return stuff;
    }

    public List <ShopItem> getOnlyAvailable(){
        List <ShopItem> onlyAvailable = new ArrayList<>();
        for (ShopItem item: shopItemList) {
            if (item.getQuantity() != 0){
                onlyAvailable.add(item);
            }
        }
        return onlyAvailable;
    }

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public List <ShopItem> getNike(){
        List <ShopItem> hasNike = new ArrayList<>();
        for (ShopItem item: shopItemList) {
            if(item.getName().contains("nike") || item.getDescription().contains("nike")){
                hasNike.add(item);
            }
        }
        return hasNike;
    }

    public List <ShopItem> cheapestFirst(){
        List <ShopItem> cheapest = new ArrayList<>();
        shopItemList.sort(Comparator.comparing(o -> o.getPrice()));
        return shopItemList;
    }

    public String getAverageStock(){
        int sum = 0;
        for (ShopItem item: shopItemList) {
            sum = sum+ item.getQuantity();
        }
        int average = sum / shopItemList.size();
        return Integer.toString(average);
    }

    public List <ShopItem> searchResult(String name){
        List <ShopItem> searchResultList = new ArrayList<>();
        for (ShopItem item: shopItemList) {
            if (item.getDescription().contains(name) || item.getName().contains(name)){
                searchResultList.add(item);
            }
        }
        return shopItemList;
    }
}
