public class function_append {

    public static void main (String [] args){

        String typo = " Chinchill";
        System.out.println(append_func(typo));

    }
    public static String append_func(String input_string){

        String add_one_char = input_string + "a";
        return add_one_char;

    }
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`
}
