final class Vehical {
    final String brand = "Generic";
    void Describe() {
        System.out.println("Brand" + brand);
    }
}
class Car extends Vehical {
    String model;
    Car (String model) {
        this.model;
    }
    @ Override
    void Describe() {
        super.Describe();
        System.out.println("Model: " + model);
    }
}
public class MyCar {
    public static void main(String[] args) {
        Car Toyota = new Car("Sedan");
        Toyota.Describe();
    }
}
