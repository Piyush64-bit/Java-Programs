// Example of a generic method in Java
package OOPs.GenericInterface;

public class Example {
    public static <T> void printArray(T[] array) {
        for (T element: array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};
        printArray(intArray);
        printArray(strArray);
    }
}
