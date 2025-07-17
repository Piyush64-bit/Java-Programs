import java.util.Arrays;

public class PassingInFunctions {
    // creating a method
    // 1. Strings are immutable in java
    // 2. Arrays are mutable in java 
    // mutablity means, theri values can be modified at the run time 
     static void change(int [] arr){
        arr[0] = 99;
     }

    public static void main(String[] args) {
        int [] nums = {1,2,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
}
