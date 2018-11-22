package CharSequence;

public class Main {
    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("Stuff to look");
        System.out.println(gnirts.charAt(4));

        Shifter shifter = new Shifter("not looking here", 2);
        System.out.println(shifter.charAt(0));
    }
}
