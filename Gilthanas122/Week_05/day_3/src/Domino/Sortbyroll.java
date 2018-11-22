package Domino;

import java.util.Comparator;

class Sortbyroll implements Comparator<Domino> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Domino a, Domino b) {
        if (a.getLeftSide() != b.getLeftSide()){
            return a.getLeftSide() - b.getLeftSide();
        }
        else {
            return a.getRightSide() - b.getRightSide();
        }
    }
}
