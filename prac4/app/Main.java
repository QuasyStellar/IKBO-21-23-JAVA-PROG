package src.app;

import src.vehicles.Car;
import src.vehicles.ElectricCar;
import src.vehicles.Vehicle;

public class Main {
  public static void main(String[] args) {
    Vehicle car =
        new Car("Toyota Camry", "ABC123", "White", 2020, "John Doe", "123456789", "Gasoline");
    Vehicle electricCar =
        new ElectricCar("Tesla Model 3", "XYZ987", "Red", 2022, "Jane Doe", "987654321", 75);

    System.out.println(car);
    System.out.println(electricCar);

    car.setOwnerName("Alice");
    electricCar.setColor("Blue");

    System.out.println("\nUpdated Info:");
    System.out.println(car);
    System.out.println(electricCar);

    System.out.println("\nVehicle Types:");
    System.out.println("Car Type: " + car.vehicleType());
    System.out.println("ElectricCar Type: " + electricCar.vehicleType());
  }
}
