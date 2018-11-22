package superGarden;

public abstract class Plant implements Waterable{

    private double currentWaterLevel;
    private double absorbLevel;
    private int minimumWaterLevel;

    public Plant(double absorbLevel, int minimumWaterLevel) {
        currentWaterLevel = 0;
        this.absorbLevel = absorbLevel;
        this. minimumWaterLevel = minimumWaterLevel;
    }

    @Override
    public String toString() {
        return "The plant" + (needWater()? "needs": "doesnt need");
    }

    @Override
    public void water(double amount) {
        currentWaterLevel += amount * 0.75;
    }

    @Override
    public boolean needWater() {
        return currentWaterLevel <5;
    }
}
