package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String ownerName, String insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + ", Battery Capacity: " + batteryCapacity + " kWh";
    }
}
