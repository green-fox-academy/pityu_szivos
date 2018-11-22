package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
   protected String string;


    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        index++;
        return this.string.charAt(string.length()-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
    /* @Override
    public char charAt(String string, int index) {
        return string.charAt(string.length()-(index-1));
    }*/


}
