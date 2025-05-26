import java.util.*;

public class Multi {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declare a 2D array 'arr' with 3 rows but unspecified columns
        int arr[][] = new int[3][];
        
        // Initialize a 2D array 'arr2' with 3x3 fixed dimensions
        // This creates a perfect square matrix
        int arr2[][] = {
            {1, 2, 3},  // First row
            {4, 5, 6},  // Second row
            {7, 8, 9}   // Third row
        };

        // Initialize a 2D array 'arr3' with varying column lengths
        // This demonstrates a jagged array (array with different column lengths)
        int arr3[][] = {
            {1, 2},           // First row has 2 columns
            {1, 2, 3},        // Second row has 3 columns
            {1, 2, 3, 4}      // Third row has 4 columns
        };
            
        // Taking input for arr - Dynamic array creation
        System.out.println("Enter elements for arr:");
        // Loop through each row
        for (int i = 0; i < 3; i++) {
            // Ask user for number of columns in current row
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            // Create a new array for current row with specified number of columns
            arr[i] = new int[cols];
            
            // Take input for each element in the current row
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the dynamically created array 'arr'
        System.out.println("Array arr:");
        // Outer loop iterates through rows
        for (int i = 0; i < arr.length; i++) {
            // Inner loop iterates through columns of current row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Print the fixed-size array 'arr2'
        System.out.println("\nArray arr2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Print the jagged array 'arr3'
        System.out.println("\nArray arr3:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Additional notes about 2D arrays in Java:
// 1. When we create an array, the reference (arr) is stored in the stack while the actual elements are stored in the heap
// 2. A 2D array is essentially an array of arrays
// 3. arr.length gives the number of rows in the array
// 4. When iterating a 2D array:
//    - The outer for loop iterates over each row
//    - The inner for loop iterates over each column of the current row
// 5. arr[i].length is used to get the number of columns in a specific row
//    - This is particularly useful for jagged arrays where different rows may have different numbers of columns