package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
  private int batteryCapacity;

  public ElectricCar(
      String model,
      String license,
      String color,
      int year,
      String ownerName,
      String insuranceNumber,
      int batteryCapacity) {
    super(model, license, color, year, ownerName, insuranceNumber);
    this.batteryCapacity = batteryCapacity;
    setEngineType("Electric");
  }

  @Override
  public int getBatteryCapacity() {
    return batteryCapacity;
  }

  @Override
  public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public String vehicleType() {
    return "Electric Car";
  }
}