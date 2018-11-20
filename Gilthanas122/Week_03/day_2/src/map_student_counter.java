import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static javax.management.Query.value;

public class map_student_counter {

    public static void main(String... args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Theodor");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);


        ArrayList<Object> age_stuff = new ArrayList<>();
        ArrayList<Object> iterate_name = new ArrayList<>();
        int age_sum = 0;

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candies
        for (Map<String, Object> entry : map) {
            for (String key : entry.keySet()) {

                Object value = entry.get("candies");
                int n = (int) value;
                if (n > 4) {
                    Object value_name = entry.get("name");
                    if (!iterate_name.contains(value_name))
                        System.out.println(value_name + "has more than 4 candies");
                    iterate_name.add(value_name);
                } else {

                    Object age = entry.get("age");
                    age_stuff.add(age);
                }
            }
        }

       double sum_full = 0;
        for (Object i : age_stuff) {
            if (i instanceof Double) {
                double stuff = (double) i;
                sum_full = sum_full + stuff;
            }
            else{
                int n = (int) i;
                double stuff = (double) n;
                sum_full = sum_full + stuff;

            }

        }

        System.out.println("Summed ages of people, who own less than 5 candies " + sum_full);

    }
}

