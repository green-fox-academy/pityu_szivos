package Garden;

public class Flower extends Garden {

    public Flower() {
        this.color = "blue";
        this.absorptionLevel = 0.75;
        this.amountWaterNeeded = 5;
    }

    public Flower(String color) {
        this.absorptionLevel = 0.75;
        this.amountWaterNeeded = 5;
        this.color = color;
    }
}
