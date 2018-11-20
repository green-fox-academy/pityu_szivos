import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practiceArray {
    public static void main(String[] args) {

       List<Integer> binary = new ArrayList<>();
       binary.add(0);
       binary.add(1);
       binary.add(1);
       binary.add(1);
       binary.add(1);
       binary.add(0);


       double counter = 0;
       double rounds = 0;
        for (int i = binary.size()-1; i >= 0; i --){
            if(binary.get(i) == 1) {
                    counter = counter + Math.pow(2, rounds);
                    rounds++;
                }
            else{
                counter = counter;
                rounds++;
            }
        }
        System.out.println(counter);
    }
    }