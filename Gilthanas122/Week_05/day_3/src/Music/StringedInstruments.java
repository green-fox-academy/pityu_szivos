package Music;

public abstract class StringedInstruments extends Instrument {
    protected int numberOfStrings;
    protected String sound;
    abstract void sound();

    @Override
    void play() {
        sound();
    }
}
