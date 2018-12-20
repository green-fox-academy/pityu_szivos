package com.foxclub.demofoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> tricks;
    private Boolean hungry;
    private Boolean thirsty;

    public Fox(String name) {
        this.name = name;
        hungry= true;
        thirsty = true;
        tricks = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isThirsty() {
        return thirsty;
    }

    public void setThirsty(boolean thirsty) {
        this.thirsty = thirsty;
    }
}
