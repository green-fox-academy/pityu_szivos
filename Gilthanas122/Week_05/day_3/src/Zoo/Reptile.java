package Zoo;

public class Reptile extends Animal {
    protected String breeding;
    public Reptile(String name) {
        this.name = name;
        age = 30;
        gender = "female";
        legs = 4;
        color = "green";
        breeding = "laying eggs";
    }

    @Override
    void breed() {
        System.out.println("A " + name + " is breeding by " + breeding);
    }
}
