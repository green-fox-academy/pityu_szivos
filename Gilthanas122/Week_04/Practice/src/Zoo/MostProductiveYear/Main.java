/*package Zoo.MostProductiveYear;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {             // ALUL UGYANAZ PARSEINTTEL!!

    public static void main(String[] args) {
        String name = "paramount";
        getMostProductiveYear(name);
    }

    public static void getMostProductiveYear(String studioName) {
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get("/home/pityu/home/Gilthanas122/Week_04/Practice/src/Zoo/MostProductiveYear/" + studioName + ".csv");
            lines = Files.readAllLines(filePath);
            String linesString = "";
            for (String s : lines) {
                linesString += s;
            }

            System.out.println(Arrays.asList(splittedList.toArray()));
            HashMap<String, Integer> getMostProductList<String> splittedList = Arrays.asList(linesString.split(","));iveYear = new HashMap<>();
            for (int i = 1; i < splittedList.size(); i += 2) {
                if (getMostProductiveYear.containsKey(splittedList.get(i))) {
                    int count = getMostProductiveYear.get(splittedList.get(i));
                    getMostProductiveYear.put(splittedList.get(i), count + 1);
                } else {
                    getMostProductiveYear.put(splittedList.get(i), 1);
                }
            }
            System.out.println(studioName + " had the most productive year in " + Collections.max(getMostProductiveYear.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey());
        } catch (Exception exception) {
            System.out.println("No such studio " + studioName + " Please try another!");
        }
        }
}*/
/*try {
      // read all the lines from apple.csv
      List<String> appleLines = Files.readAllLines(Paths.get("apple.csv"));
      List<String[]> splittedAppleLines = new ArrayList<>();
      for (String line : appleLines) {
        // split them at the ;
        String[] splittedLine = line.split(";");
        splittedAppleLines.add(splittedLine);
      }

      // find max value
      // first item as default
      String mostApplesAsString = splittedAppleLines.get(0)[3];
      int mostApples = Integer.parseInt(mostApplesAsString);
      // iterate through all the items
      for (int i = 1; i < splittedAppleLines.size(); i++) {
        // compare the next item to the max
        if (Integer.parseInt(splittedAppleLines.get(i)[3]) > mostApples) {
          // if bigger then set the max to the actual
          mostApples = Integer.parseInt(splittedAppleLines.get(i)[3]);
        }
      }

      System.out.println("THE MAX APPLE AMOUNT IS " + mostApples);
      //The year of the month is: JAN
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


 * Write a method that helps you find the most productive year for a film studio.
 * The method should take one argument, which is the name of the film studio.
 * The method should try to open the related data file named `studioname`.csv,
 * which is a comma separated file with 3 columns: name of the movie, release year, director
 *
 *  - If we do not have any data about the studio, the method should return an error message.
 *  - If we have found data, the method should return an information message about the most productive year for that studio.
 *
 * Examples:
 *
 * If we call the method with 'marvel':
 * should return 'marvel has made the most movies in 2017.'
 *
 * If we call the method with 'ghibli':
 * should print 'Cannot find studio, please try again later.'
 *
 * Hint:
 *  - You can find some example files in this folder (marvel.csv and paramount.csv)
 *  - Most productive year: The year in which the studio has made the most movies.
 */
