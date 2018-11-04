import java.io.*;

public class string_reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        char [] reverse_array = reversed.toCharArray();
        System.out.println(reverse_array);
        System.out.println(reverse(reverse_array));



    }




   public static char[] reverse(char [] input_text){

        for (int i = 0; i < input_text.length -2 ; i++) {
            input_text[i] = input_text[input_text.length -i - 1];

            /*for (int j = 0; j < input_text.length(); j++) {
               new_text.charAt(j) = input_text.charAt(i);
            } */
        }
        return input_text;
        }



    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
}
