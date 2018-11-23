package Music;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
        EletricGuitar guitar = new EletricGuitar();
        BassGuitar bassGuitar = new BassGuitar();
        Violin violin = new Violin();

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        EletricGuitar guitar2 = new EletricGuitar(7);
        BassGuitar bassGuitar2 = new BassGuitar();

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }
}
