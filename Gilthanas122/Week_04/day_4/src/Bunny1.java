public class Bunny1 {
    public static void main(String[] args) {

        System.out.println(bunny(2, 8 ));
    }

    public static int bunny(int ears, int num){

        if(num == 0){
            return 0;
        }
        else {
            // decrease n by one
            return bunny(ears, num-1) + ears;
        }
    }
}
