public class fibonacci {

    static int fibMemo[];
    public static void main(String[] args) {

        System.out.println(fibonacci(3));
    }

    static public int fibonacci(int n){
        int counter = 0;
        if (n == 1 || n == 2){
            return 1;
        }
        else{
            counter ++;
            return fibonacci(n + 1) + fibonacci(n + 2);
        }
    }



    }
