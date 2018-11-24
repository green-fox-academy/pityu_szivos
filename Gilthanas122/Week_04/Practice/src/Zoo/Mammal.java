package Zoo;

public class Mammal extends Animal {
    public Mammal() {
        name = "Vampire";
        age = 1200;
        gender = "male";
    }

    public Mammal(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void getName() {
        System.out.println("My name is " + name);
    }

    @Override
    public void breed() {
        System.out.println( "The " +  this.name + " " + this.getClass().getSimpleName() + " breeds by laying eggs");
    }
}
