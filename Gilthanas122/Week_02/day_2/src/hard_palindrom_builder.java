import java.util.Scanner;
import java.io.*;


public class hard_palindrom_builder {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println(" Give me a word to palindromise: ");
        String word_palindrom = scanner.nextLine();*/

        String word_palindrom = "abcdef";
        //char[] temp = word_palindrom.toCharArray();
        char[] temp = word_palindrom.toCharArray();
        System.out.print(word_palindrom);
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i]);
        }



    }
}
