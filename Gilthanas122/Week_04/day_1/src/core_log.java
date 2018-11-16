import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class core_log {
    public static void main(String[] args) {

        String path = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/log.txt";
        returnIP(path);
        postGetRation(path);

    }
    public static void returnIP(String path_in){

        try {
            Path filePath = Paths.get(path_in);

            List<String> list = Files.readAllLines(filePath);
            String listString = "";

            for (String s : list) {
                listString += s + "\t";
            }
            List<String> split_list = new ArrayList<>();
            for (String retval : listString.split("   ")) {

                split_list.add(retval);


            }

            List <String> ip_list = new ArrayList<>();
            for (int i = 1; i <split_list.size() ; i += 2) {
                ip_list.add(split_list.get(i));
            }
            System.out.println(ip_list);

        }
        catch (Exception e) {
                System.out.println("Could not find file");
        }
    }

    public static void postGetRation(String pathIn){
        Path filePath = Paths.get(pathIn);
        try {
            List<String> list = Files.readAllLines(filePath);
            String listString = "";

            for (String s : list) {
                listString += s + "\t";
            }
            List<String> split_list = new ArrayList<>();
            for (String retval : listString.split(" ")) {

                split_list.add(retval);


            }
            int getCounter = 0;
            int postCounter = 0;
            for (int i = 0; i <split_list.size() ; i++) {
                if (split_list.get(i).equals("GET")){

                    getCounter++;
                }
                else if( split_list.get(i).equals("POST")){
                    postCounter++;
                }
            }
            System.out.println("Number of GET: " + getCounter + " Number of POST: " + postCounter);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
