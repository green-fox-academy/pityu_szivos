import java.util.Scanner;

public class loops_2 {
    public static void main(String[] args){

    //28 Draw triangle

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Give me a number: ");
        int user_input = scanner.nextInt();

        int counter = 0;
        for (int i = 0; i < user_input; i++){
            counter++;
            System.out.println("");
            // System.out.print("\r\n");       // add new line
            for (int j = 0; j < counter; j++){
                System.out.print("*");
            }

        }


        //29 Draw a pyramid

        Scanner scanner_pyramid = new Scanner(System.in);
        System.out.println( " Give me a whole number: ");
        int user_input_pyramid = scanner_pyramid.nextInt();


        int spaces_pyramid = user_input_pyramid % 2;
        int counter_pyramid = 0;
        for (int i = 0; i < user_input; i++){
            counter_pyramid++;
            System.out.println("");
            // System.out.print("\r\n");       // add new line
            spaces_pyramid--;
            for (int k = 0; k < spaces_pyramid; k++){
                System.out.print("");
                for (int j = 0; j < counter_pyramid; j++){
                    System.out.print("*");
                }




            }


        }
        Scanner scanner_calculate = new Scanner(System.in);
        System.out.println( " How many numbers you wish to add together?: ");
        int user_original_number = scanner_calculate.nextInt();

        int v = 0;
        int sum_number = 0;
        while (v < user_original_number){


            Scanner scanner_ask_number = new Scanner(System.in);
            System.out.println( " Give me another whole number: ");
            int ask_number = scanner_ask_number.nextInt();
            sum_number= sum_number + ask_number;
            v++;
        }

        System.out.println("Sum: " + sum_number + " Average: " + sum_number / user_original_number );
        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

    }
}


