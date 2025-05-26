
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

// 1. Strings are immutable in java.
// 2. Arrays are mutable in java
// 3. Mutablity -> Their values can be modified at run time.
