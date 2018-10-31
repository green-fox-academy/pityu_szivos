public class array_matrix {
    public static void main(String[] args) {

        int rows = 4;
        int columns = 4;

        int[][] array_1 = {};
        int[][] array = new int[rows][columns];



        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                if(i == j){
                    array[i][j] = 1;
                }
                else{
                    array[i][j]= 0;
                }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();

        }
    }
}









