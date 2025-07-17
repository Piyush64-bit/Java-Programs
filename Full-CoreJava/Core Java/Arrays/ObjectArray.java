public class ObjectArray {
    public static void main(String[] args) {
        // Step 1: Create an Object array with different data types
        Object[] mixedArray = {123, "Java", 45.67, true, 'A'};

        // Step 2: Convert each element to String and print it
        for (Object element : mixedArray) {
            String str = element.toString();  // toString() is available on every Object
            System.out.println("Converted to String: " + str);
        }
    }
}


// Object[] mixedArray = {...};
// This creates an array that can hold any type of data, since everything in Java extends Object.

// Elements include:

// 123 (int, autoboxed to Integer)

// "Java" (String)

// 45.67 (double, autoboxed to Double)

// true (boolean, autoboxed to Boolean)

// 'A' (char, autoboxed to Character)

// 🔸 element.toString()
// Every class in Java inherits the toString() method from the Object class.

// Primitive values like int, boolean, etc., are autoboxed into their wrapper classes (Integer, Boolean), which override toString() to return a readable string form.
