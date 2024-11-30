package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
  public static void main(String[] args) {
    // Создание экземпляра Car
    Car car = new Car("Toyota Corolla", "ABC-123", "Blue", 2015, "Alice Johnson", "INS-001");
    System.out.println(car);

    // Создание экземпляра ElectricCar
    ElectricCar electricCar =
        new ElectricCar("Tesla Model 3", "TES-456", "Red", 2022, "Bob Smith", "INS-002", 75);
    System.out.println(electricCar);

    // Изменение года выпуска и имени владельца
    car.setYear(2018);
    car.setOwnerName("Charlie Brown");
    electricCar.setYear(2023);
    electricCar.setOwnerName("Diana Prince");

    // Изменение страхового номера
    car.setInsuranceNumber("INS-003");
    electricCar.setInsuranceNumber("INS-004");

    // Получение информации о емкости батареи
    System.out.println(
        "Battery Capacity of ElectricCar: " + electricCar.getBatteryCapacity() + " kWh");

    // Вывод обновленных данных
    System.out.println(car);
    System.out.println(electricCar);
  }
}
