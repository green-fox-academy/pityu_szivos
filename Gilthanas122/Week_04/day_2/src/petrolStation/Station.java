package petrolStation;

public class Station {

    Integer gasAmount;

    public Station(int gasAmount){
        this.gasAmount = gasAmount;
    }


    public void refill(int capacity, int gasAmountCar){

        this.gasAmount = gasAmount - capacity;
        gasAmountCar = gasAmountCar + capacity;
        System.out.println(gasAmount);
        System.out.println(gasAmountCar);
    }

    public static void main(String[] args) {
        Station station = new Station(40);
        Car car = new Car();

        station.refill(30, 30);
    }


}
