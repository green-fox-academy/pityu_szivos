package Domino;

import java.util.ArrayList;
import java.util.List;

public class Domino implements Printable {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public void printAllFields(Domino d) {
        System.out.print("[" + d.getRightSide() + ",");
        System.out.print(d.getLeftSide() + "]");
    }
}
