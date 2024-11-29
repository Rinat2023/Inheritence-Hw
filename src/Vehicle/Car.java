package Vehicle;

public class Car extends Vehicle{
    private String brand;
    private String honk;

    public Car(int speed, int fuel, String brand, String honk) {
        super(speed, fuel);
        this.brand = brand;
        this.honk = honk;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "brand='" + brand + '\'' +
                ", honk='" + honk + '\'' +
                '}';
    }
}
