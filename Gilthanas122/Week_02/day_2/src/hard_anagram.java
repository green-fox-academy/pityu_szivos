import java.util.Scanner;

// This is for palindrome

public class hard_anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Give me the first word to anagramise!");
        String first_word = scanner.nextLine();

        Scanner scanner_2 = new Scanner(System.in);
        System.out.println(" Give me the first word to anagramise!");
        String second_word = scanner_2.nextLine();

        anagram(first_word, second_word);
    }

    public static String anagram(String first, String second) {
        while (first.length() != second.length()){


            for (int i = 1; i < first.length() / 2; i++) {


                if (first.charAt(i - 1) == second.charAt(second.length() - i)) {
                    System.out.println("Yes palindrome!");
                } else {
                    System.out.println("No");

                }
            }
        }
    return "no";}
}