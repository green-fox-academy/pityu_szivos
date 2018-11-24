package Zoo;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String gender;

    public Animal() {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public abstract void getName();
    public abstract void breed();
}
