import java.util.ArrayList;
import java.util.LinkedList;

public class hard_armstrong {

    public static void main(String[] args) {

        double n = 1634;
        double m = n;

        ArrayList<Double>  list_num = new ArrayList<>();

        while (m > 0) {
            list_num.add( m % 10 );
            //n= Math.round(((n/ 10) * 100) / 100);
            m = Math.floor(m / 10);
        }

       sorted_armstrong(list_num, n);
    }

    public static void sorted_armstrong(ArrayList <Double> input_list, double number_input){
            double n = 0;
        for (int i = 0 ; i < input_list.size() ; i++) {
            double m = Math.pow(input_list.get(i), input_list.size());
            n = n + m;
        }

        if (n == number_input){

            System.out.println("Your " + number_input + " is an Armstrong number");
        }
    }
}
