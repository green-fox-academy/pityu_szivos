package com.greenfoxacademy.rueppelli.seadog.springintrohelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Name {
    private Long id;
    private static AtomicLong staticId = new AtomicLong(0);
    private String name;

    public Name(String name){
        this.name = "Pityu";
        this.id = staticId.incrementAndGet();
    }

    public long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String returnHellos(){
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
            int random = (int) ((Math.random() * 40 + 1));
            return hellos[random];
    }

    public int getFontSize(){
        int random = (int) ((Math.random() * 40));
        return random;
    }

    public String getRandomColor(){
        String [] colors = {"red", "green", "yellow", "blue", "green"};
        int random = (int) ((Math.random() * 4) + 1);
        return colors[random];
    }
}
