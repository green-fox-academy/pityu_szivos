package Zoo;

public class Mammal extends Animal {
    public Mammal(String name) {
        this.name = name;
        this.age = 40;
        this.gender = "female";
        this.legs = 4;
    }

    @Override
    public String breed() {
        return "having live-born children";
    }
}
