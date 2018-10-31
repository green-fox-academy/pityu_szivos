public class array_reverse_list {

    public static void main(String [] args){

        int [] a = {3, 4, 5, 6, 7};

        for (int i = 1; i < a.length / 2 ; i++) {
            int temp = a[a.length -i];
            a[a.length-i] = a[0];
            a[0] = temp;

            System.out.println(a[0]);
        }


    }

    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
}
