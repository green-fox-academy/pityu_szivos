import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
       int n = 5;
        for (int i = 0; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = n - i; j > 2; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("**");
                    }


                }
                System.out.println();
            }
            else {
                for (int j = 0; j <= i - n /2 -1; j++) {
                    System.out.print(" ");
                }
                for (int j = n - i  ; j >= 0 ; j--) {
                    if(j ==  n - i ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("**");
                    }

                }
            System.out.println("");
            }
        }
    }
}
