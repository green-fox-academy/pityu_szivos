public class variables {

    public static void main(String[] args){

        //07 Favorite number //

        int favoriteNumber = 8;
        System.out.println("My favorute number is: " + favoriteNumber);
        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8"

        //08 Swap

        // Swap the values of the variables
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);

        //09 BRNI

        double massInKg = 81.2;
        double heightInM = 1.78;

        double BRNI = massInKg / (heightInM * heightInM);
        System.out.println(" Your BRNI is: " + BRNI);

        //10 Define basic info

        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String own_name = "Pityu";
        int own_age = 32;
        double own_height =  1.90;
        boolean married = true;

        //11 variable mutation

        int a_1 = 3;
        // make the "a" variable's value bigger by 10
        System.out.println(a_1 + 10);

        int b_1 = 100;
        // make b smaller by 7

        System.out.println(b -7);

        int c_1 = 44;
        // please double c's value

        System.out.println(c_1 * 2);

        int d_1 = 125;
        // please divide by 5 d's value

        System.out.println(d_1 / 5);

        int e_1 = 8;
        // please cube of e's value

        System.out.println(e_1 * e_1);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        if (f1 > f2){

            System.out.println(true);
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        if ( g2 *2 > g1){

            System.out.println(true);
        }

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        if ( h % 11 == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if ( i1 > i2 * i2 && i1 < i2 * i2 * i2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j % 3 == 0 || j % 5 == 0){

            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        String k = "Apple";
        //fill the k variable with its content 4 times
        int counter = 0;

        while( counter < 4){
            System.out.println(k);
            counter++;
        }

        //12 Cuboid

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        // Surface Area: 600
        // Volume: 1000

        int side_a=  5;
        int side_b = 6;
        int side_c= 7;

        int cuboid_surface = (side_a*side_b*2) + (side_a*side_c*2) + (side_b*side_c*2);
        int cuboid_volume = side_a * side_b * side_c;

        System.out.println("Surface Area: " + cuboid_surface);
        System.out.println("Volume: "+ cuboid_volume);

        // 13 Seconds in time
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

       int remaining_time_seconds = 60 - currentSeconds;
       int remaining_time_minutes = 60 - currentMinutes;
       int remaining_time_hours = 23 - currentHours;

       if( remaining_time_seconds == 60 && remaining_time_minutes == 60){
            remaining_time_hours = remaining_time_hours + 1;
}

       System.out.println("Remaining time is: " + remaining_time_hours + " hours " + remaining_time_minutes + " minutes " + remaining_time_seconds + " seconds");












    }
}
