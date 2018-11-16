package Animal;

public class Animal {


    int hunger = 50;
    int thirst = 50;

    public Animal(){
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }
    public void play(){
        thirst++;
        hunger++;
    }

    @Override
    public String toString() {
        return "Animal{" + "hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}


