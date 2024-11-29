package Vehicle;

public class Vehicle {
    private int speed;
    private int fuel;

    public Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void move (){
        System.out.println("move");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", fuel=" + fuel +
                '}';
    }
}
