import java.util.Scanner;

public class user_input {
    public static void main(String[] args){

        //14 Hellouser
        Scanner scanner_X = new Scanner(System.in);
        System.out.println("Hello, user! Give me your name");
        String user_name_input = scanner_X.nextLine();
        System.out.println("Your name is " + user_name_input);

        //15 MiletoKmconverter

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Give me the distance in km: ");
        double user_input_km = scanner.nextDouble();
        double km_to_miles = (double)user_input_km * 0.62137;
        System.out.println(" The distance in miles is: " + km_to_miles);

        //16 Animals legs

        // Write a program that asks for two integers

        Scanner scanner_2 = new Scanner(System.in);
        System.out.println("Give me the number of chicken: ");
        int number_chicken = scanner_2.nextInt();
        Scanner scanner_3 = new Scanner(System.in);
        System.out.println("Give me the number of pigs: ");
        int number_pigs = scanner_3.nextInt();
        int total_legs = number_pigs *4 + number_chicken *2;
        System.out.println(total_legs);

        //17 Average of input
        int number_4 = 0;
        for (int i = 0; i < 5; i++){
            Scanner scanner_4 = new Scanner(System.in);
            System.out.println("Give me a number: ");
            number_4 +=  scanner_4.nextInt();
        }

        System.out.println(" Sum: "+ number_4);
        System.out.println("Average: " + number_4 /5);



    /*
         Creates a scanner
        Scanner scanner = new Scanner(System.in);

         The program stops and waits for user input and to press enter
        String userInput1 = scanner.nextLine();

        It prints the whole line that was given by the user
        System.out.println(userInput1);

        The program stops and waits for user input that is an integer and to press enter
        int userInput2 = scanner.nextInt();

        It prints the integer
        System.out.println(userInput2);
        */
    }
}
