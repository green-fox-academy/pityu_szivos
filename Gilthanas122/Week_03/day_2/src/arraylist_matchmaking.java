import java.util.ArrayList;
import java.util.Arrays;

public class arraylist_matchmaking {
    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(making_matches(girls, boys));
    }

    static public ArrayList making_matches( ArrayList <String> matches_1, ArrayList <String> matches_2 ){

        ArrayList <String> merged_list = new ArrayList<>();

       merged_list.addAll(matches_2);

        for (int i = 0; i < matches_1.size() ; i++) {
                merged_list.add( i*2, matches_1.get(i));
    }

        return merged_list;}
}

