public class function_compare_lines {
    public static void main(String [] args){

    print_params("this", "that", "another that");

    }


    public static void print_params(String... args) {
        for (String arg : args) {
           System.out.println(arg);
        }

    }
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")

}
