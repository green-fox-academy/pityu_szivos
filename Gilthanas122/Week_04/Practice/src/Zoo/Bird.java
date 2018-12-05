package Zoo;

import Flyable.Flyable;

public class Bird extends Animal implements Flyable  {
    public Bird(String name) {
        this.name = name;
        this.age = 50;
        this.gender = "male";
        this.legs = 2;
    }

    @Override
    public String breed() {
        return "by laying eggs";
    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void fly() {

    }
}
