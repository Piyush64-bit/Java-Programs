// Interface (Abstraction)
interface Vehicle {
    void start();
    void stop();
}

// Base Class (Encapsulation with private fields)
class Car implements Vehicle {
    private String brand;
    private int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getters and Setters (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println(brand + " is starting...");
    }

    public void stop() {
        System.out.println(brand + " has stopped.");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Derived Class (Inheritance)
class ElectricCar extends Car {
    private int batteryLife;

    public ElectricCar(String brand, int year, int batteryLife) {
        super(brand, year); // calling parent constructor
        this.batteryLife = batteryLife;
    }

    // Overriding Method (Polymorphism)
    @Override
    public void start() {
        System.out.println(getBrand() + " (Electric) is starting silently...");
    }

    public void displayBattery() {
        System.out.println("Battery Life: " + batteryLife + "%");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        myCar.start();
        myCar.displayDetails();
        myCar.stop();

        System.out.println();

        ElectricCar myEV = new ElectricCar("Tesla", 2023, 85);
        myEV.start();
        myEV.displayDetails();
        myEV.displayBattery();
        myEV.stop();
    }
}
