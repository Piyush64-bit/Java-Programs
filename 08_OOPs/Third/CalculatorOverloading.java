// File: CalculatorOverloading.java

public class CalculatorOverloading {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorOverloading calc = new CalculatorOverloading();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(double, double): " + calc.add(15.5, 20.3));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
    }
}
