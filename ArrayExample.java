public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements
        System.out.println("First number: " + numbers[0]);  // Outputs 10

        // Loop through the array
        System.out.println("All numbers:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
