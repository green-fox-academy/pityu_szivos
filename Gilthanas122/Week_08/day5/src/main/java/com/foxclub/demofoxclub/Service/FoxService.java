package com.foxclub.demofoxclub.Service;

import com.foxclub.demofoxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    List<Fox> myFoxes;

    public FoxService(){
        myFoxes = new ArrayList<>();
    }

    public void eatAndDrink(Fox fox){
        if (fox.isHungry() || fox.isThirsty()){
            fox.setThirsty(false);
            fox.setHungry(false);
        }
    }

    public void addFox(Fox fox){
        myFoxes.add(fox);
    }

    public Fox returnFox(String name){
        Fox fox2 = new Fox("bobby");
        for (Fox fox: myFoxes) {
            if (fox.getName()== name){
                fox2 = fox;
            }
        }
       return fox2;
    }
}
