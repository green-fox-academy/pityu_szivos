import java.util.ArrayList;
import java.util.Scanner;

public class hard_flavius_problem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many people should be in the circle?");
        int number_people = scanner.nextInt();

        ArrayList<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= number_people; i++) {
            circle.add(i);
        }


        System.out.println(josephus_counter(circle));
    }

    public static ArrayList josephus_counter(ArrayList<Integer> arraylist_circle) {


        int counter = 1;
        while (arraylist_circle.size() > 1) {


            if (counter < arraylist_circle.size()) {
                arraylist_circle.remove(counter);
                counter ++;
            } else {
                counter = counter - arraylist_circle.size();
                arraylist_circle.remove(counter);
                counter++;
            }


        }
        return arraylist_circle;
    }
}
