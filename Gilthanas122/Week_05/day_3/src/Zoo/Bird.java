package Zoo;

import Flyable.Flyable;

public class Bird extends Animal implements Flyable {
    protected String breeding;

    public Bird(String name) {
        this.name = name;
        age = 20;
        gender = "male";
        legs = 2;
        color = "pink";
        breeding = "laying eggs";
    }

    @Override
    void breed() {
        System.out.println("A " + name + " is breeding by " + breeding);
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
