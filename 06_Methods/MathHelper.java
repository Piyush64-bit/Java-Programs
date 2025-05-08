public class MathHelper {
    public static void main(String[] args) {
        int sumint = add(10, 5);
        double sumdouble = add(3.5, 2.7);
        boolean isPOS = isPositive(8);

        printResult("Integer Sum", sumint);
        printResult("Double Sum", sumdouble);

        if (isPOS) {
            System.out.println("8 is positive");
        } else {
            System.out.println("8 is negative");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    // Method overloaded for both int and double types
    public static void printResult(String operation, double result) {
        System.out.println(operation + ": " + result);
    }

    public static void printResult(String operation, int result) {
        System.out.println(operation + ": " + result);
    }
}
