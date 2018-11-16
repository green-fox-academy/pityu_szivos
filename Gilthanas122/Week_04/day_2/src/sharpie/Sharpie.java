package sharpie;

public class Sharpie {


    String color;
    Double width;
    Double inkAmount;

    public  Sharpie(){
        this("", 0.00, 100.00);
    }

    public Sharpie(String color, Double width, Double inkAmount){

        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use(){
        inkAmount -= 1;
    }

    /*Create Sharpie class
    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    When creating one, we need to specify the color and the width
    Every sharpie is created with a default 100 as inkAmount
    We can use() the sharpie objects
    which decreases inkAmount*/
}
