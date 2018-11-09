import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.print.attribute.standard.MediaSizeName.A;

public class decryption_alphabet {

    public static void main(String[] args) {

        String path = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/decryption_alphabetNextChar.txt";
        alpbabetChange(path);
    }

    private static void alpbabetChange(String path) {
        try {
            Path filePath = Paths.get(path);
            List<String> list = Files.readAllLines(filePath);

           // char[] charArray_list = list.toArray();
            // String alphabet = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY");

            //char[] charArray_alphabet = alphabet.toCharArray();

            String listString = "";

            for (String s : list)
            {
                listString += s + "\t ";
            }

            String next = "";
            for (int i = 0; i <listString.length() ; i++) {
                int charValue = listString.charAt(i);
                next = next + String.valueOf((char) (charValue - 1));
            }


            System.out.println(next);

        }
        catch (IOException e){
            System.out.println(" Ooops, shit gone wrong");
        }
    }
}
