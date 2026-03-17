package vehicle;

public class Main {
    static void main() {
        Vehicle car = new Car("Toyota", "Camry", 2020, CarType.SEDAN);
        Vehicle electricCar = new ElectricCar("Tesla", "Model 3", 2021, CarType.SPORT, 80);

        car.start();
        electricCar.start();

        ((ElectricCar) electricCar).chargeBattery();

        System.out.println(car);
        System.out.println(electricCar);
    }
}
