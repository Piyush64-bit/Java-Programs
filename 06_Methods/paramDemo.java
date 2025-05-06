public class paramDemo {
    public static void main(String[] args) {
        addNumbers(5, 3);
        addNumbers(10, 20);
    }
    public static void addNumbers(int a, int b){
        int sum = a + b;
        System.out.println("Sum of: " + a + " and " + b + " " + sum);
    }
};
