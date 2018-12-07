package Vehicle;

public class Vehicle {
    private boolean canPark;

    public Vehicle() {
        this.canPark = canPark;
    }

    public void setCanPark(boolean canPark) {
        this.canPark = canPark;
    }

    public boolean isCanPark() {
        return canPark;
    }

    public boolean canParkGarage() {
        if (this.isCanPark()){
            return true;
        }
        return false;
    }
}
