package Zoo;

public abstract class Animal {
    String name;
    int age;
    String gender;
    int legs;

    public Animal() {
        this.name = "Animal Joe";
        this.age = 30;
        this.gender = "male";
        this.legs = 3;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();
}
