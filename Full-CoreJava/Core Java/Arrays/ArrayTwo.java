import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        // taking input from the user
        Scanner in = new Scanner(System.in);

        int[] originalArr = new int[5];
        originalArr[0] = 23;
        originalArr[1] = 45;
        originalArr[2] = 233;
        originalArr[3] = 543;
        originalArr[4] = 3;
        System.out.println(originalArr[3]);

        int[] arr = new int[5]; // array to store user input

        //  giving the input using the for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // enhanced for loop - 
        for (int num : arr) {  //for every element in array, print the element
            System.out.print(num + " "); //here num represents every element of an array
        }

        System.out.println(originalArr[4]); // index out of bound error with this, last digit can be the 5th index
    }
}
