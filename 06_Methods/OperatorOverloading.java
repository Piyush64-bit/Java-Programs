public class OperatorOverloading {
    public static void main(String[] args) {
        System.out.println("Addition: " + math(5, 8, '+'));
        System.out.println("Multiplication: " + math(5, 8, '*'));
        System.out.println("Division: " + math(8, 2, '/'));
    }

    public static int math(int a, int b, char operation) {
        switch (operation) {
            case '+': return a + b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }
}
