package Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {


    public int sumList(List <Integer> numberList){
        int sum = 0;
        for (int a: numberList) {
            sum = sum + a;

        }
        return sum;
    }

    public int getSum(List <Integer> numberList){
        return sumList(numberList);
    }
}
