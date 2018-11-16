package Pirates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleApp {

    public static void main(String[] args) {

        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();

        pirate1.drinkSomeRum();


        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        ship1.fillShip();
        ship2.fillShip();



        ship1.battle(ship2);

        ship1.printOutElement();
        ship2.printOutElement();



        /*for(Model model : models) {
            System.out.println(model.getName());
        }

       Or like this...
        for(int i = 0; i < models.size(); i++) {
            System.out.println(models.get(i).getName());
        }*/





    }
}
