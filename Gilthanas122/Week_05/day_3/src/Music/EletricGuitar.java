package Music;

public class EletricGuitar extends StringedInstruments {

    public EletricGuitar() {
        name = "Electric guitar";
        numberOfStrings = 6;
        sound = "nyenye";
    }

    public EletricGuitar(int numberOfString) {
        this.name = "Electric guitar";
        this.numberOfStrings = numberOfString;
        this.sound = "nyenye";
    }

    @Override
    public void sound() {
        System.out.println(name + " has " + numberOfStrings + "-strings " + sound + " sound");
    }

}
