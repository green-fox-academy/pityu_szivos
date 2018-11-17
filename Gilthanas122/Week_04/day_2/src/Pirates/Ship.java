package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    //Field Variables

    private int crew;
    private int aliveMembers;

    List<Pirate> crewList = new ArrayList<>();

    public Ship() {
        this.crew = (int) (Math.random() * 10) + 2;
        this.aliveMembers = crew;

    }


    public void fillShip() {
        for (int i = 0; i < crew; i++) {
            Pirate pirate = new Pirate();
            if (i == 0) {
                pirate.drinkSomeRumShip();

                crewList.add(pirate);
                pirate.setCaptain();
            } else {
                pirate.drinkSomeRumShip();
                if (pirate.isPassedOut()) {
                    break;
                } else {
                    crewList.add(pirate);
                }

            }
        }
    }

    public int battle(Ship otherShip) {
        if (this.crewList.size() - this.crewList.get(0).getRumCounter() > otherShip.crewList.size() - otherShip.crewList.get(0).getRumCounter()) {
            for (Pirate pirate : this.crewList) {
                pirate.drinkSomeRumShip();
            }
            for (Pirate pirate : otherShip.crewList) {
                int randomDeath = (int) (Math.random() * 10);
                if (randomDeath > 5) {
                    pirate.setDead(true);
                    aliveMembers--;
                }
            }
            System.out.println("Ship1 has won!");
            return 0;
        } else if (this.crewList.size() - this.crewList.get(0).getRumCounter() == otherShip.crewList.size() - otherShip.crewList.get(0).getRumCounter()) {
            System.out.println("The two ships could not beat each other");

            return 1;
        } else {
            for (Pirate pirate : otherShip.crewList) {
                pirate.drinkSomeRumShip();
            }
            for (Pirate pirate : this.crewList) {
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
        Pirate pirate2 = new Pirate();
        if (pirate2.getParrot() == 1) {
            System.out.println("AARRRRR INTERRUPTION");
        }
        return ("CrewList=" + crewList);
    }

    public void printOutElement() {
        for (Pirate pirate : crewList) {
            if (pirate.isCaptain() == true) {
                System.out.printf("This is the captain.%nIs he awake: " + pirate.isPassedOut() + "%nHe drunk some " + pirate.getRumCounter() + " rums %n");
            } else {
                aliveMembers++;
            }

        }
        System.out.println("Crew alive: " + aliveMembers);
    }
}
