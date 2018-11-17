package Pirates;

public class BattleApp {

    public static void main(String[] args) {

        Pirate pirate1 = new Pirate();

        pirate1.drinkSomeRum();

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        ship1.fillShip();
        ship2.fillShip();

        ship1.battle(ship2);
        ship1.printOutElement();

    }
}
