package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {

    int armadaShips;


    public Armada() {
        this.armadaShips = (int) (Math.random() * 10) + 2;
    }

    List<Ship> Armada = new ArrayList<>();

    public void fillArmada() {
        for (int i = 0; i < armadaShips; i++) {
            Ship ship = new Ship();
            ship.fillShip();
            Armada.add(ship);
        }
    }

    public void printOutElement() {
        System.out.println("Armada: " + armadaShips);
    }

    public boolean armadaBattle(Armada otherArmada) {

        int shipCounter1 = this.Armada.size();
        int shipCounter2 = otherArmada.Armada.size();

        for (int i = Armada.size(); i > 1; i--) {
            Ship ship1 = this.Armada.get(i - 1);
            Ship ship2 = Armada.get(i - 1);
            ship1.battle(ship2);
            if (true || Armada.size() > 0) {
                shipCounter2--;
                Armada.get(i - 2);
            } else if (false || this.Armada.size() > 0) {
                shipCounter1--;
                this.Armada.get(i - 2);

            } else {
                break;
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