import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list_solar_system {
    public static void main(String[] args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus",
                "Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.
        planetList.set(5, "Saturn");

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

    }

    static public ArrayList putSaturn( ArrayList <String> saturn){

        ArrayList<String> saturn_2 = new ArrayList();
        saturn_2.addAll(saturn);
        return saturn_2;
    }
}
