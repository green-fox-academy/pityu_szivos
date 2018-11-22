package Zoo;

public class Mammal extends Animal {
    protected String breeding;
    public Mammal(String name) {
        this.name = name;
        age = 20;
        gender = "male";
        legs = 4;
        color = "blue";
        breeding = "having liveborn kids";
    }

    @Override
    void breed() {
        System.out.println("A " + name + " is breeding by " + breeding);
    }
}
