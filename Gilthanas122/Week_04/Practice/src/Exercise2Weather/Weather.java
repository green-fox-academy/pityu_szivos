package Exercise2Weather;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Weather {
    public static void main(String[] args) {
        mostRainyCity();
    }

    public static void mostRainyCity() {
        try {
            Path filePath = Paths.get("/home/pityu/Desktop/basicExam/rueppellii-foundation-normal-exam/src/Exercise2Weather/weather.csv");
           List <String> lines = Files.readAllLines(filePath);
            String linesString = "";
            for (String s : lines) {
                linesString += s;
            }
            List<String> splitList = Arrays.asList(linesString.split(","));
            List <String> cityWeatherlist = new ArrayList<>();
            for (int i = 1; i <splitList.size() ; i++) {
                if (i % 2 != 0) {
                    cityWeatherlist.add(splitList.get(i));
                } else if(i % 2 == 0 && splitList.get(i).charAt(0)== 'R') {
                    cityWeatherlist.add(splitList.get(i).substring(0, 5));
                }
            }
            HashMap<String, Integer> getMostRainyCity = new HashMap<>();
            for (int i = 0; i < cityWeatherlist.size(); i += 2) {
                if (getMostRainyCity.containsKey(cityWeatherlist.get(i))) {
                    int count = getMostRainyCity.get(cityWeatherlist.get(i));
                    getMostRainyCity.put(cityWeatherlist.get(i), count + 1);
                } else {
                    getMostRainyCity.put(cityWeatherlist.get(i), 1);
                }
            }
            System.out.println(" The most rainy city is " + Collections.max(getMostRainyCity.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey());
        } catch (Exception exception) {
            System.out.println("Oops, something went wrong");
        }
    }
}

