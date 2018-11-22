package CharSequence;

public class Shifter implements CharSequence {

    private String string;
    private int shifter;

    public Shifter(String string, int shifter) {
        this.string = string;
        this.shifter = shifter;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index + shifter);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
