public class hard_subString {
    public static void main(String[] args) {

        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        String x = "this is dog";
        String y = "dog";
        subStr(x, y);
    }

    public static int subStr(String input, String q) {
        if (input.contains(q)){
            System.out.println(input.indexOf(q));
            return input.indexOf(q);
        }
        else {
            System.out.println(-1);
            return -1;
        }

    }
}
