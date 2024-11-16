public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 2024;
    }

    public Car(String model, String license) {
        this.model = model;
        this.license = license;
        this.color = "Unknown";
        this.year = 2024;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Model: " + model + ", License: " + license + ", Color: " + color + ", Year: " + year;
    }

    public int getCarAge(int currentYear) {
        return currentYear - this.year;
    }
}

