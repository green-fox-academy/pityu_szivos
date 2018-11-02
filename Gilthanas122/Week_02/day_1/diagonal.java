public class diagonal {
    public static void main(String [] args){

        int n = 5;

        for (int i = 0; i < n ; i++) {
            if( i == 0 || i == n -1){
                for (int j = 0; j <n ; j++) {
                    System.out.print("%");
                }
            }
            else if( i % 2 == 1){
                for (int j = 0; j < n ; j++) {
                    System.out.print(" ");
                }
            }
            else{

                for (int j = 1; j < i ; j++) {
                    System.out.print("%");
                }

                for (int j = 1; j <= i ; j++) {
                    System.out.print(" %");
                        }



            }


       System.out.println(""); }
    }
}
