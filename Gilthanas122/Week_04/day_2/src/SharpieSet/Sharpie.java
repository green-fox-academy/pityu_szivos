package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class Sharpie {    //2. object category with these elements and methods activated


    String color = "";
    Double width = 10.00;
    Double inkAmount = 1.00;

    public static void main(String[] args) {

    }



    @Override
    public String toString() {
        return "Sharpie color "+color+ " width " + width + " ink amount " + inkAmount;
    }

    public Sharpie(String color, Double width, Double inkAmount){

        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;



    public void use(){

        inkAmount -= 1;
    }

    public boolean empty() {
        if (inkAmount == 0) {
            return false;
        }
        else{
            return false;
        }
    }

    /*Create Sharpie class
    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    When creating one, we need to specify the color and the width
    Every sharpie is created with a default 100 as inkAmount
    We can use() the sharpie objects
    which decreases inkAmount*/
}
