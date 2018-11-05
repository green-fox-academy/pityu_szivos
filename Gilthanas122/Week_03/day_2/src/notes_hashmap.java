import java.util.HashMap;

public class notes_hashmap {

    public static void main(String[] args) {
        // store any object under a key -> no static order -> iteration different order

        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Katie", "Android, Wordpress");
        hm.put("Magda", "Facebook");
        hm.put("Vanesse", "Tools");
        hm.put("Ania", "Java");
        hm.put("Anie", "Jee");  //  java overwritten

        // Hashmap iteration

        for (String key : hm.keySet()) {
            System.out.println((key + ":" + hm.get(key)));
        }
        System.out.println();

        if (hm.containsKey("Katie")) {
            System.out.println("Hashmap contains key 'Katie");
        }
        System.out.println();

        if (hm.containsValue("Cooking")) {
            System.out.println("Hash map contains Cooking");
        } else {
            System.out.println("Hashmap does not contain cooking");
        }
    }
}
