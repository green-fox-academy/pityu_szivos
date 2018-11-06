import java.util.Random;
import java.util.Scanner;

public class hard_guess_my_number {

    public static void main(String[] args) {

        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the range of the possible numbers. Give me a number: ");
        int range_random_number = scanner.nextInt();
        int n = rand.nextInt(range_random_number) + 1;

        guess_my_number(n);


    }

    public static void guess_my_number(int m) {

        int lives = 5;
        System.out.println(m);

        while (lives >= 0) {

            Scanner scanner_2 = new Scanner(System.in);
            System.out.println(" What is your guess? ");
            int user_guess = scanner_2.nextInt();
            if (user_guess > m && lives > 0) {
                System.out.println(" Your guess is higher. Try again. You have" + lives + "left");
                lives--;
            } else if (user_guess < m && lives > 0) {
                System.out.println("Your guess is lower. Try again. You have" + lives + "left");
                lives--;
            } else if (user_guess == m){
                System.out.println("You guessed right. The number was " + m);
                break;
            }
            else{
                System.out.println("Game over. No lives left");
                break;
            }
        }
      /* Scanner scanner = new Scanner(System.in);
        System.out.println(" Give me a word to palindromise: ");
        String word_palindrom = scanner.nextLine();*/}
}
