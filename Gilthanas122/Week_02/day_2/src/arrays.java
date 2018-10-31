public class arrays {
    public static void main(String[] args){


        int[] numbers = new int[10]; // always the right side works first, cannot change size, not dynamic
        numbers[8] = 8;    // set a value

        System.out.println(numbers.toString());
        System.out.print(numbers);
        System.out.println(numbers[8]); // check the xth element
        System.out.println(numbers.length);
        numbers[numbers.length -1] = 100;
        System.out.println(numbers[numbers.length -1]); // last element
        final int john = 2; // you cannot changed it after it

        int[][] matrix;
        int matrix_as_well[][];  //multidimensional matrix -> as many dimensions as many you want
       // matrix_as_well[0][1];


        final boolean[] booleans = new boolean[2];      // i can change the value but not the reference -> where it points to in the memory
        booleans[0] = true;

        int[] copy_of_numbers = numbers; // we did not copy the value, but the reference/path to that specific memory storage!!!!
        numbers[numbers.length -1] = 101;
        System.out.println(copy_of_numbers[copy_of_numbers.length -1]); // changed ->
    }
}
