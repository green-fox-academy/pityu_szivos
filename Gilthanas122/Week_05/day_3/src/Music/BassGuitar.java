package Music;

public class BassGuitar extends StringedInstruments {
    protected String sound;

    public BassGuitar() {
        name = "Bass guitar";
        numberOfStrings = 4;
        sound = "duum-duum-duum";
    }

    public BassGuitar(int numberOfString) {
        name = "Electric guitar";
        this.numberOfStrings = numberOfString;
        sound = "duum-duum-duum";
    }

    @Override
    public void sound() {
        System.out.println(name + " has " + numberOfStrings + "-strings " + sound + " sound");
    }
}
