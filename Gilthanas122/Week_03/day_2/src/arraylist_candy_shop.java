import java.util.ArrayList;
import java.util.Arrays;

public class arraylist_candy_shop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    public static ArrayList sweets(ArrayList<Object> replace_stuff) {

        for (int i = 1; i < 4; i += 2) {
            if (i == 1) {
                replace_stuff.set(i, "Croissant");
            } else {
                replace_stuff.set(i, "Ice cream");
            }

        } return replace_stuff;
    }
}
