package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    //Field Variables


    private int aliveMembers;

    List<Pirate> crewMembers = new ArrayList<>();

    public Ship() {
        this.aliveMembers = crewMembers.size();
        this.crewMembers = new ArrayList<>(10);
    }


    public void fillShip() {
        int crew = (int) (Math.random() * 10) + 2;
        Pirate pirate = new Pirate();
        pirate.drinkSomeRumShip();
        crewMembers.add(pirate);
        pirate.setCaptain();
        for (int i = 0; i < crew; i++) {
            Pirate pirate2 = new Pirate();
            pirate2.drinkSomeRumShip();
            if (pirate2.isPassedOut()) {
                pirate2.setPassedOut(true);
            } else {
                crewMembers.add(pirate);
                }

            }
        }

    public int battle(Ship otherShip) {
        if (this.crewMembers.size() - this.crewMembers.get(0).getRumCounter() > otherShip.crewMembers.size() - otherShip.crewMembers.get(0).getRumCounter()) {
            for (Pirate pirate : this.crewMembers) {
                pirate.drinkSomeRumShip();
            }
            for (Pirate pirate : otherShip.crewMembers) {
                int randomDeath = (int) (Math.random() * 10);
                if (randomDeath > 5) {
                    pirate.setDead(true);
                    aliveMembers--;
                }
            }
            System.out.println("Ship1 has won!");
            return 0;
        } else if (this.crewMembers.size() - this.crewMembers.get(0).getRumCounter() == otherShip.crewMembers.size() - otherShip.crewMembers.get(0).getRumCounter()) {
            System.out.println("The two ships destroyed each other");

            return 1;
        } else {
            for (Pirate pirate : otherShip.crewMembers) {
                pirate.drinkSomeRumShip();
            }
            for (Pirate pirate : this.crewMembers) {
                int randomDeath = (int) (Math.random() * 10);
                if (randomDeath > 5) {
                    pirate.setDead(true);
                    aliveMembers--;
                }
            }
            System.out.println("Ship2 has won");
            return 2;
        }
    }

    @Override
      public String toString() {
        for (Pirate pirate : crewMembers) {
            if (pirate.Captain()) {
                System.out.printf("This is the captain.%nIs he awake: " + pirate.isPassedOut() + "%nHe drunk some " + pirate.getRumCounter() + " rums %n");
            } else {
                aliveMembers++;
            }
        }
        System.out.println("Crew alive: " + aliveMembers);
        return "no";
    }
}
