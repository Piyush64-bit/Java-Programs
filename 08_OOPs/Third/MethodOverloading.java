class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class MethodOverloading {
public static void main(String[] args) {
    Calculator c1 = new Calculator();
    System.out.println(c1.add(2, 3));
    System.out.println(c1.add(2.5, 3.5));
    System.out.println(c1.add(2, 3, 7));
}
};
