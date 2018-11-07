import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class notes_exceptions_file_reading {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        File file = new File (pathname:"FileReader.html");

        // System.out.println(file.exists());                                checks if it exists -> no error mess
        //System.out.println(file.canRead() + ", " + file.canWrite()  )     checks if be can read/written in to it -> no error mess

        try {
            Scanner scanner2 = new Scanner(file);
            while  (scanner2.hasNext()){                          // loop fpr checking a scanner than can be displayed
            System.out.println(scanner2.nextLine());            // to read the scanner lines


        }
        scanner.close();


        catch  (IOException ex) {                 //catch the exception f.e handling files
        }
    }  // catch (Exception ex)  {                      from more specific to less specific

        }
}
