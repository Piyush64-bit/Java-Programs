public class ArrayExample {
    public static void main(String[] args) {
        String[] arr1 = new String[3];  // array created with 3 null values

        System.out.println("arr1[0]: " + arr1[0]);  // prints: null

        // This will throw NullPointerException 😵
        System.out.println("Length: " + arr1[0].length());
    }
}
