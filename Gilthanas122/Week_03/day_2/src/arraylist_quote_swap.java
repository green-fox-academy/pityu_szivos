import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylist_quote_swap {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        quoteSwap(list);
        // Expected output: "What I cannot create I do not understand."
    }

    public static ArrayList quoteSwap(ArrayList <String> in_list){

        Collections.swap(in_list, 2, 5);

        String listString = " ";

        for (String s : in_list)
        {
            listString += s + " ";
        }

        System.out.println(listString);
        return in_list;


    }
}
