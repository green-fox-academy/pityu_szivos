package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    //Field Variables
    int armadaShips;

    //Methods
    public Armada() {
        this.armadaShips = (int) (Math.random() * 3) + 2;
    }

    List<Ship> Armada = new ArrayList<>();

    public void fillArmada() {
        for (int i = 0; i < armadaShips; i++) {
            Ship ship = new Ship();
            ship.fillShip();
            Armada.add(ship);
        }
    }

    public boolean armadaBattle(Armada otherArmada) {

        int shipCounter1 = this.Armada.size();
        int shipCounter2 = otherArmada.Armada.size();

        int roundShip1 = 0;
        int roundShip2 = 0;

        while (shipCounter1 > 0 && shipCounter2 > 0) {
            Ship ship1 = this.Armada.get(roundShip1);
            Ship ship2 = otherArmada.Armada.get(roundShip2);
            if (ship1.battle(ship2) == 0) {
                shipCounter2--;
                roundShip2++;
            } else if (ship1.battle(ship2) == 1) {
                shipCounter1--;
                shipCounter2--;
                roundShip1++;
                roundShip2++;
            } else {
                shipCounter1--;
                roundShip1++;
            }
        }
        if (shipCounter2 == 0) {
            System.out.println("ARMADA 1 has one. Gimme rum!");
            return true;

        } else {
            System.out.println("ARMADA 2 has one. Gimme rum!");
            return false;
        }
    }

}


