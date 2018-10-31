public class function_factorio {
    public static void main(String [] args){


    int number = 6;
    System.out.println(factorio(number));

    }
    public static int factorio(int fact){
        int facting = 1;
        for (int i = 1; i <= fact; i++){

            facting = facting * i;
        }
        return facting;
    }


    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
}
