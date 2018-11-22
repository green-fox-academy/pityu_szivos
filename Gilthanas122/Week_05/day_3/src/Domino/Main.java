package Domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        Collections.sort(dominoes, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < dominoes.size(); i++)
            System.out.println(dominoes.get(i));
        System.out.println(dominoes);

        /*Thing thing = new Thing("thing1");
        Thing thing2 = new Thing("thing2");
        List<Thing> things = new ArrayList<Thing>();
        thing.compareTo(thing2);*/

        for (Domino d : dominoes) {
            d.printAllFields(d);
        }
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(1, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
