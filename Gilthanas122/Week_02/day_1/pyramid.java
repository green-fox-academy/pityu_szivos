public class pyramid {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
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
    }
}

