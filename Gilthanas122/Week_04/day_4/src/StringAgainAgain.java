public class StringAgainAgain {
    public static void main(String[] args) {

        String input = "stuff to change";


        System.out.println(StringAgainAgain(input));
    }

    public static String StringAgainAgain(String input){
        int counter = 0;

        if (counter == input.length()){
            return input;
        }
        else{
            // take the char
            return input.charAt(0) + '*' + StringAgainAgain(input.substring(0, 1));
            // add star
        }

    }
}
