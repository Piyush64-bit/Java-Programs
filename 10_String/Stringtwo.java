import java.util.Arrays;

public class Stringtwo {
    public static void main(String[] args) {
        System.out.println("56");
        System.err.println("Kunal");
        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4}));
    }
}



// For executing every command in println(), it is calling the return Integer.toString() method.

// If it is a null object, it will print null, otherwise it prints toString().

// Every time we println() or pass any object into it, it calls the .value → then with one "cmd" operator checks whether the object is null or not → then + → null or obj.toString()

// With Arrays.toString() → you're overriding default toString() in Java.