public class Counter {
    public static void main(String[] args) {

       counter(6);
    }

    public static int counter(int n) {

        if (n == 0) {
            return 1;

        } else {
            System.out.println(n);
            return counter(n - 1) + 1;
        }

    }
}
