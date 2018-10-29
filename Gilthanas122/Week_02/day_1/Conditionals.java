import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){

        //18 Oddeven

        Scanner scanner_5 = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number_5 =  scanner_5.nextInt();

        if(number_5 % 2 != 0){

            System.out.println(" Your number is odd!");
        }
        else{
            System.out.println("Your number is even");
        }


        //19 Onetwoalot

        Scanner scanner =  new Scanner (System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();

        if (number <= 0){

            System.out.println( " Not enough");
        }
        else if (number == 1){
            System.out.println( " 1");
        }
        else if (number == 2){
            System.out.println( " 2");
        }
        else{
            System.out.println("A lot");
        }


    //20 Printbigger

        Scanner scanner_1 = new Scanner(System.in);
        System.out.println("Give me the first number: ");
        int number_1 = scanner_1.nextInt();

        Scanner scanner_2 = new Scanner(System.in);
        System.out.println("Give me the first number: ");
        int number_2 = scanner_2.nextInt();

        if (number_1 < number_2){

            System.out.println(number_2);
        }
        else{
            System.out.println(number_1);
        }
    // 21 Party indicator
        Scanner scanner_3 = new Scanner(System.in);
        System.out.println("Give me the number of girls: ");
        int number_girls = scanner_3.nextInt();

        Scanner scanner_4 = new Scanner(System.in);
        System.out.println("Give me the number of boys: ");
        int number_boys = scanner_4.nextInt();


        if ( number_boys + number_girls >= 20 && number_boys == number_girls){

            System.out.println(" The party is excellent");
        }
        else if( number_boys + number_girls >= 20 && number_boys != number_girls ){

            System.out.println(" Quite cool party");
        }
        else if (number_boys + number_girls < 20){

            System.out.println(" Average party!");
        }
        else if (number_girls == 0){
            System.out.println("Sausage party");
        }

        // Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

    // 22 Conditional variable mutations

        double a = 24;
        int out = 0;

        if (a % 2 == 0){
            out++;
        }
        System.out.println(out);



        int b = 13;
        String out2 = "";

        if (b > 10 && b < 20){
            out2 = "Sweet";
        }
        else if (b < 10){
            out2 = "Less!";
        }
        else{
            out2="More";
        }
        System.out.println(out2);



        int c = 123;
        int credits = 126;
        boolean isBonus = true;

        if (credits >= 126 && isBonus == false){
            c = c -2;
        }
        else if (credits < 50 && isBonus == false){

            c = c -1;
        }
        else if (isBonus == true){
            c = c;
        }
        System.out.println(c);




        int d = 7;
        int time = 201;
        String out3 = "";

        if(d % 4 == 0 && time > 200){
           out3 = "check";
        }
        else if (time > 200){
           out3 = "Time out";
        }
        else{
            out3 = "Run forest run!";
        }
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        System.out.println(out3);
    }


}
