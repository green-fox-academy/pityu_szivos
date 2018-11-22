package Music;

public class EletricGuitar extends StringedInstruments {

    public EletricGuitar() {
    this(6);
    }

    public EletricGuitar(int numberOfString) {
        super(numberOfString, "Electric guitar");
    }

    @Override
    public String sound(){
        return "nyenye";
    }

}
