package Music;

public class Violin extends StringedInstruments {
    protected String sound;

    public Violin() {
        name = "Violin";
        numberOfStrings = 4;
        sound = "Screech";
    }

    public Violin(int numberOfStrings) {
        this.name = "Violin";
        this.numberOfStrings = numberOfStrings;
        this.sound = "Screech";
    }

    @Override
    public void sound() {
        System.out.println(name + " has " + numberOfStrings + "-strings " + sound + " sound");
    }
}
