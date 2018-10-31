public class function_summing {

    public static void main (String [] args) {

       System.out.println(summing(6));
    }

    public static int summing(int number){
        int adding = 0;
        for (int i = 1; i <= number; i++){
            adding = adding + i;

        }
        System.out.println(adding);
        return adding;
    }

    //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
}
