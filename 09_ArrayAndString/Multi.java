import java.util.*;

public class Multi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        int arr2[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int arr3[][] = {
            {1, 2},
            {1, 2, 3},
            {1, 2, 3, 4}
        };
            
        // Taking input for arr
        System.out.println("Enter elements for arr:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array arr:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArray arr2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArray arr3:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}