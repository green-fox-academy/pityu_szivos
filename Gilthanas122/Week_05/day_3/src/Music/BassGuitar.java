package Music;

public class BassGuitar extends StringedInstruments {
    protected String sound;

    public BassGuitar() {
        super(5, "Bass Guitar");
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
