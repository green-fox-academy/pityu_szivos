package Music;

public abstract class StringedInstruments extends Instrument {
    protected int numberOfStrings;
    protected String sound;

    public StringedInstruments(int numberOfStrings, String name) {
        this.numberOfStrings = numberOfStrings;
        this.name = name;
    }

    abstract String sound();

    @Override
    public void play() {
        System.out.println(name + " has a " + numberOfStrings + "-strings " + sound() + " sound");
    }
}
