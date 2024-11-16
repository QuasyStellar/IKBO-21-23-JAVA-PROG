public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", "A123BC", "Black", 2015);
        Car car2 = new Car();
        Car car3 = new Car("Honda Civic", "B456DF");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        car2.setModel("Ford Focus");
        car2.setLicense("C789GH");
        car2.setColor("Red");
        car2.setYear(2018);
        
        System.out.println("Updated car2: " + car2.toString());

        int currentYear = 2024;
        System.out.println("Car1 age: " + car1.getCarAge(currentYear));
        System.out.println("Car2 age: " + car2.getCarAge(currentYear));
        System.out.println("Car3 age: " + car3.getCarAge(currentYear));
    }
}

