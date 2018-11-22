package Fibonacci;

public class Fibonacci {

    public static int fibonacci(int number) {
        if (number < 0){
            return -1;
        }
        if ((number == 0) || (number == 1)) // base cases
            return number;
        else
            // recursion step
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
