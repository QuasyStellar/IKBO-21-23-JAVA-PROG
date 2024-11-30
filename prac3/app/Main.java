package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("John Doe", "123456789", "Gasoline");
        ElectricCar electricCar = new ElectricCar("Jane Doe", "987654321", 75);

        System.out.println(car.getCarInfo());
        System.out.println(electricCar.getCarInfo());

        car.setOwnerName("Alice");
        electricCar.setBatteryCapacity(80);

        System.out.println("\nUpdated Info:");
        System.out.println(car.getCarInfo());
        System.out.println(electricCar.getCarInfo());

        System.out.println("\nEngine Type of ElectricCar: " + electricCar.getEngineType());
    }
}
