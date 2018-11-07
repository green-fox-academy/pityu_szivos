import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class notes_path {
    public static void main(String[] args) {
        File file = new File();          // new container for the file in the program
        Path path = Paths.get("FileReader.iml");       // paths: collections of useful methods
        Files.isReadable(path);                             // Files: all file system interactions
        Files.isWritable(path);                             //
        Files.isDirectory(path);                            //  they return boolean
        try {
            
          //   List<String> lines = Files.readAllLines(path);       // returns the lines as strings into a list
            for (String line: Files.readAllLines(path)) {            //(path) = line 13 Paths.get...

                System.out.println(line.toUpperCase());  }           //gets you a stream, can for each them;
                Files.readAllLines(path)


                .map(line -> line.toUpperCase());                    // manipulate them before
                .filter(line -> !line.startsWith(" ");                 //filter them -> groups them with one group starting with " "
                .forEach (line -> System.out.println(line.toUpperCase()));



            }

            Files.lines(Paths.get("FileReader.iml"))
           //  Files.write(path, lines)                        // write into it
            Files.lines();                                  // return a Stream type
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
