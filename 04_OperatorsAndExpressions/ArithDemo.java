public class ArithDemo {
    public static void main (String[]args) {
        int a = 10, b = 3;

        System.out.println("Addition:" + (a+b));
        System.out.println("Subtraction:" + (a-b));
        System.out.println("Multiplication:" + (a*b));
        System.out.println("Division:" + (a/b));
        System.out.println("Modulus:" + (a%b));

        a++;
        System.out.println("Incremented Value of A: " + a);
        b--;
        System.out.println("Decremented Value of B: " + b);
    }
}
