package javaisepic;
public class string_methods {
    public static void main(String[] args) {
        String s = "WOrd";
        String s1 = "wordieword";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        if (s1.startsWith("word")){
            System.out.println("s1 starts with word ");
        }

        if (s.endsWith("word")){
            System.out.println("s1 ends with word ");
        }
        if (s.equalsIgnoreCase(s1)){
            System.out.println("s1 starts with");
        }
        System.out.println(s.concat(s)); // add strings to each other

        System.out.println(s.charAt(0));       // prints out the char at index 0

        System.out.println(s.indexOf('r', 4));        // starts searching from 4 and returns first char

        System.out.println(s.substring(3)); // from index three get back all the chars
        System.out.println(s.substring(3, 5)); // between these two numbers retnrs

        System.out.println(s.replace("r", "1"));  // replaces all the r with 1

        System.out.println(s.trim());  // removes leading or trailing white space in the string
           }
}
