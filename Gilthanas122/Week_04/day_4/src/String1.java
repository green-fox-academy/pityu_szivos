import java.lang.reflect.Array;

public class String1 {
    public static void main(String[] args) {


        System.out.println(stringIn("stuffx to change newex", 'x', 'y'));

    }

    public static String stringIn(String toChange, char x, char y){


        if (toChange.indexOf(x) == -1){
            return toChange;
        }
        else{
            char [] stuff = toChange.toCharArray();
            stuff[toChange.indexOf(x)] = y;
            return stringIn(new String(stuff), x, y);
        }
    }
}
