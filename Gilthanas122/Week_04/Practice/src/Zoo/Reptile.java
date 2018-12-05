package Zoo;

public class Reptile extends Animal {

    public Reptile(String name) {
        this.name = name;
        this.gender = "female";
        this.age = 30;
        this.legs = 4;
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
