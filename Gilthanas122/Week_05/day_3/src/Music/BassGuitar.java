package Music;

public class BassGuitar extends StringedInstruments {
    protected String sound;

    public BassGuitar() {
        super(4, "Bass Guitar");
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
