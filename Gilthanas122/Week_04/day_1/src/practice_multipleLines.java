import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class practice_multipleLines {

    public static void main(String[] args) {

        String word = "apple";

        String pathString = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/myFile2.txt";
        int counter = 5;

        writeMultipeLines(word, pathString, counter);


    }

    public static void writeMultipeLines(String inputText, String inputPath, int counter_in)  {
        String input_2 = "stuff";
        Path filePath = Paths.get(inputPath);
        ArrayList<String> list = new ArrayList<>();
        list.add(inputText);

        try {

            for (int i = 0; i < counter_in; i++) {
                Files.write(filePath, list);

            }

            }
        catch(Exception e){
                System.out.println("Sorry could not write to file " + inputPath);
            }


        }


    }


// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
