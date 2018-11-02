import java.util.Scanner;

// This is for palindrome

public class hard_anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Give me the first word to compare!");
        String first_word = scanner.nextLine();

        Scanner scanner_2 = new Scanner(System.in);
        System.out.println(" Give me the second word to compare!");
        String second_word = scanner_2.nextLine();

        System.out.println(palindrom(first_word, second_word));

        palindrom(first_word, second_word);
    }

    public static boolean palindrom(String first, String second) {

        boolean palindrom = false;
        if (first.length() == second.length()){
            if(first.length() % 2 == 0){

                for (int i = 1; i < first.length() / 2; i++){

                    if(first.charAt(i - 1) != second.charAt(second.length() - i)){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            }
            else{
                for(int i = 1; i < (first.length()-1)/2 +1; i++){
                    if(first.charAt(i - 1) != second.charAt(second.length() - i)){
                        return false;
                    }
                    else{
                        return true; }
                } } } else{
            return false; }
            return false;}}