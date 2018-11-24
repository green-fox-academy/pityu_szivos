package Garden;

public class Tree extends Garden{

    public Tree(){
        this.color = "pink";
        this.absorptionLevel = 0.40;
        this.amountWaterNeeded = 10;
    }

    public Tree(String color){
        this.absorptionLevel = 0.40;
        this.amountWaterNeeded = 10;
        this.color = color;

    }
}
