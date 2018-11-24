package Zoo;

public class Reptile extends Animal {

    public Reptile(){
        name = "Reptile Joe";
        age = 200;
        gender = "female";
    }


    public Reptile(String name, int age, String gender) {
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
