public class AntiDiagonal {
    public static void main(String[] args) {
        int [][] arrayAntiDiagonal = new int [][]{
                {1, 2, 3, 4},
                {3 ,4 ,6, 4},
                {5, 2, 5, 4},
                {1, 2, 3, 4}};

        System.out.println(getAntiDiagonal(arrayAntiDiagonal));
    }

    public static int getAntiDiagonal(int [][] antiDiagonal){
        int sumDiagonal = 0;
        int counter = antiDiagonal.length -1;
        for (int i = 0; i <antiDiagonal.length ; i++) {
            sumDiagonal += antiDiagonal[i][counter];
            counter--;
        }
        return sumDiagonal / antiDiagonal.length;
    }

}
