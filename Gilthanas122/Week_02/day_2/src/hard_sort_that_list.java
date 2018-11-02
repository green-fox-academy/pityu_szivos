import java.util.Arrays;
import java.util.Collections;

// NOT READY YET

public class hard_sort_that_list {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        Integer[] bubble = {34, 12, 24, 9, 5};
        //  should print [5, 9, 12, 24, 34]
        // System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]

        boolean array = false;

        Arrays.sort(bubble, Collections.reverseOrder());
        System.out.print(Arrays.toString(bubble));
        Arrays.sort(bubble);
        System.out.print(Arrays.toString(bubble));

       /* if (array = true) {
            Arrays.sort(bubble);
            System.out.print(Arrays.toString(bubble));
        } else {
            Arrays.sort(bubble, Collections.reverseOrder());
            System.out.print(Arrays.toString(bubble));
        } */

    }
}
