package SharpieSet;

public class Sharpie {    //2. object category with these elements and methods activated

    String color;
    Double width;
    Double inkAmount;

    @Override
    public String toString() {
        return "Sharpie color " + color + " width " + width + " ink amount " + inkAmount;
    }

    public Sharpie() {
        color = "blue";
        width = 10.00;
        inkAmount = 2.00;
    }

    public Sharpie(String color, Double width, Double inkAmount) {

        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public double use() {
        inkAmount -= 1;
        return inkAmount;

    }

    public boolean empty() {
        if (inkAmount == 0) {
            return false;
        } else {
            return false;
        }
    }
}
