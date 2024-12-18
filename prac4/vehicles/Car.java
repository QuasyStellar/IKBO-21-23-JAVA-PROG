package vehicles;

public class Car extends Vehicle {

  public Car(
      String model,
      String license,
      String color,
      int year,
      String ownerName,
      String insuranceNumber,
      String engineType) {
    super(model, license, color, year, ownerName, insuranceNumber, engineType);
  }

  @Override
  public String vehicleType() {
    return "Car";
  }
}
