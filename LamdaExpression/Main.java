@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(add.operation(5, 3));
        System.out.println(multiply.operation(5, 3));
    }
}

// a lambda expession can be used wherever function is excepted