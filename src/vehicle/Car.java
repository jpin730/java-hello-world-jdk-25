package vehicle;

public class Car extends Vehicle {
    private CarType type;

    public Car(String brand, String model, int year, CarType type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Car{" +
                "type=" + type +
                '}';
    }
}
