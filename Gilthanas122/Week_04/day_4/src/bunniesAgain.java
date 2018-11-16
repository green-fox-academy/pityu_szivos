public class bunniesAgain {
    public static void main(String[] args) {
        System.out.println(bunniesAgain(2, 6));
    }

    public static int bunniesAgain(int ears, int n){

        if (n == 0){
            return 0;
        }
        else if (n % 2 == 0){

                n--;
                return bunniesAgain(ears, n) + ears;
            }
            else{

                n--;
                return bunniesAgain(ears, n) + ears + 1;
            }
        }
    }
