public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    public static int power(int n, int powerNum) {
        if (powerNum  == 1) {
            return n;
        } else {

            return power(n, powerNum-1) * n;
        }
    }
}
