import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int sum = 0;
        int counter = 0;
        int temp = n;



        while(temp > 0){
            for (int i = 0; i <3 ; i++) {
                temp = temp / 10;
                counter++;
            }
        }

       while(n > 0){
           int digit = n % 10;
           n = n / 10;
           sum = sum +(int) Math.pow(digit, counter);
       }
        System.out.println(sum);
    }
}
