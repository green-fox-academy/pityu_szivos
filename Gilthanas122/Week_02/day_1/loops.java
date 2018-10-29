import java.util.Scanner;

public class loops {
    public static void main(String[] args){

        //23 I won't cheat on exams

        int counter = 0;

        while (counter <100){
            System.out.println("I won't cheat on exams!");
            counter++;
        }

        //24 Print even

        int counter_2 = 0;

        while (counter_2 <500){
            if (counter_2 % 2 == 0 )
                System.out.println(counter_2);
            counter_2++;
        }

        // 25 Multiplication table
        int number_new = 5;

        for (int i = 1; i < 11; i++){

            int result = number_new * i;

            System.out.println(i + " * " + number_new + " = " + result);
        }

        //26 Count from to

        Scanner scanner =  new Scanner (System.in);
        System.out.println("Give me the first number: ");
        int number = scanner.nextInt();

        Scanner scanner_2 =  new Scanner (System.in);
        System.out.println("Give me the second number: ");
        int number_2 = scanner_2.nextInt();

        if (number_2 <= number){

            System.out.println("Second number should be bigger");
            counter = number;
            while (number > number_2){
                System.out.println(number_2);
                number_2++;
            }
        }

        //27 Fizzbuzz
        counter = 0;
        for (int i = 0; i < 100; i++){
            if (counter % 3 == 0 && counter % 5 == 0){
                System.out.println("Fizzbuzz");
            }
            else if(counter % 3 == 0){
                System.out.println("Fizz");
            }
            else if (counter % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(counter);
            }
            counter++;
        }

        // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.


    }
}
