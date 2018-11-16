public class sumDigits {
    public static void main(String[] args) {


        System.out.println(sumDigit(226));
    }

    public static int sumDigit( int n){

        if (n < 10){
          return n;
        }
        else{
            int m = n / 10;
            n = n % 10;

            return sumDigit(m) + n;

        }
    }
}
