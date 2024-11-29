package Vehicle;

public class Truck extends Vehicle{
    private int cargoCapacity;
    private int loadCargo;

    public Truck(int speed, int fuel, int cargoCapacity, int loadCargo) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
        this.loadCargo = loadCargo;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "cargoCapacity=" + cargoCapacity +
                ", loadCargo=" + loadCargo +
                '}';
    }
}
