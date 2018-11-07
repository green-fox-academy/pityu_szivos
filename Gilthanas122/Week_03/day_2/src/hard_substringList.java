public class hard_substringList {

    public static void main(String[] args) {

        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list

        String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};

        String search_for = "ching";
        int counter = 0;
        for (String n : searchArr) {

            if (n.contains(search_for)) {
                System.out.println(counter);
                break;
            }

        counter++;
        }
        System.out.println("-i");}
    }