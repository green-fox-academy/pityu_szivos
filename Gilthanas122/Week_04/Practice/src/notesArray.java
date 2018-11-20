import java.util.Arrays;
import java.util.regex.Pattern;

public class notesArray {
    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5};     // with these three elements
        int[] myIntArray2 = new int[3];       //with 3 length
        System.out.println(myIntArray[0]);

        int index = 5;
        while (index < myIntArray.length) {       //prinout everything;
            System.out.println(myIntArray[index]);
            index++;
        }

        System.arraycopy(myIntArray, 1, myIntArray2, 0, 3);
        System.out.println(Arrays.toString(myIntArray2));

      //  System.out.println(Arrays.toString(listSorted.toArray()));  // printout list
        // Arrays.toString(array)          // printout array

        //STRING
        String myString = "Hello  World, oh my-my";
        System.out.println(myString.replace('m', 'p'));  //replaces characters

        // Regex  https://www.journaldev.com/634/regular-expression-in-java-regex-example
        String str = "bbb";
        System.out.println("Using String matches method: "+str.matches(".bb"));
        System.out.println("Using Pattern matches method: "+ Pattern.matches(".bb", str));


    }
}
