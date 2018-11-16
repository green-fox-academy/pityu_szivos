import java.util.Arrays;
import java.util.List;

public class StringAgain {
    public static void main(String[] args) {

        System.out.println(stringAgain("yyxnononxxx",'x'));
    }

    public static String stringAgain(String strIn, char x){

        int index = strIn.indexOf(x);

        if (index == -1){

            return strIn;
        }
        else{

            return stringAgain((strIn.substring(0, index) + strIn.substring(index + 1, strIn.length()-1)), x);

            }


    }
}
