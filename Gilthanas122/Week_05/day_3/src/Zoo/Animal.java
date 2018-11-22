package Zoo;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected int legs;
    protected String color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getLegs() {
        return legs;
    }

    public String getColor() {
        return color;
    }

    abstract void breed();

}
