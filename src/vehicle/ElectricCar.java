package vehicle;

public class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged");
    }

    @Override
    public String toString() {
        return super.toString() + ", ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
