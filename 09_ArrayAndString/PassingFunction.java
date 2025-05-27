
import java.util.Arrays;

public class PassingFunction {
    static void change (int [] arr) {
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
}

// 1. Strings are immutable in Java:
//    Once a String object is created, its value cannot be changed.
//    Any operation that seems to modify a string (like concatenation or replacement)
//    actually creates a new String object in memory. This ensures security and consistency,
//    especially in multi-threaded environments.

// 2. Arrays are mutable in Java:
//    Arrays allow changes to their contents after creation. You can update, replace,
//    or modify individual elements within the same array object. This makes arrays
//    flexible for tasks like data manipulation or iterative processing.

// 3. Mutability:
//    An object is considered "mutable" if its internal state (its data or values)
//    can be changed after it is created. If not, it is "immutable". Mutable objects
//    are useful when you need to update or modify data over time,
//    while immutable objects offer advantages like thread safety and simplicity.


