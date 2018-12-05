package Music;

public class Violin extends StringedInstruments {

    public Violin() {
        super(4, "Violin");
    }

    @Override
    public String sound() {
        return "vooooiin";
    }
}
