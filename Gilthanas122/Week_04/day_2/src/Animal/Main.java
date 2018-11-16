package Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal rabbit = new Animal();
        rabbit.eat();
        rabbit.drink();
        rabbit.play();
        rabbit.play();
        System.out.println(rabbit.toString());
        Animal horse = new Animal();
        Animal dog = new Animal();
        Animal cow = new Animal();

        Farm farmAnimals = new Farm();
        farmAnimals.breed(6, rabbit);
        farmAnimals.breed(5, horse);
        farmAnimals.breed(4, dog);
        farmAnimals.breed(3, cow);
        farmAnimals.breed(2, cow);
        System.out.println(farmAnimals.toString());
        farmAnimals.slaughter();
        System.out.println(farmAnimals.toString());

    }
}






