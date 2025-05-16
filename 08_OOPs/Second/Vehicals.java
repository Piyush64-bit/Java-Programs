class Vehical {
    void start() {
        System.out.println("Vehical starts");
    }
}
class Car extends Vehical {
    void drive() {
        System.out.println("Car driving");
    }
}

public class Vehicals {
    public static void main(String[] args) {
        Car Toyota = new Car();

        Toyota.start();
        Toyota.drive();
    }
};
