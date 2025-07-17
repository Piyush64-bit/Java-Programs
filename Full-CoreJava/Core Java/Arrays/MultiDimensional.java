public class MultiDimensional {
    public static void main(String[] args) {
        // 1 2 3
        // 4 5 6
        // 7 8 9
        int [][] arr = new int[3][];
        // no. of rows inseration is mandatory and not the column
        int[][] arr2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}  
    };
    int[][] arr3 = {
        {1,2},
        {4,5,6},
        {7,8,9,10,11}  
};
//  taking inputs in the 2d array
java.util.Scanner sc = new java.util.Scanner(System.in);
for(int i = 0; i < arr.length; i++) {
    System.out.print("Enter number of columns for row " + i + ": ");
    int cols = sc.nextInt();
    arr[i] = new int[cols];
    
    System.out.println("Enter " + cols + " elements for row " + i + ":");
    for(int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
    }
}

System.out.println("You entered:");
for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
sc.close();


}
}


    // Points to remember
    // 1. When we create an array (arr) is stored in the stack and the elements ({1,2,3}) are storedi in the heap in java
    // 2. An array of arrays
    // 3. for ex - arr[1][0] >> [[1,2,3],[4,5,6],[7,8,9]]  -> in 2nd row oth index - 4
    // 4. Size of the column is variable here , its not fixed
        // 5. for ex- [[1,2,3], [4,5],[6,7,8,9]] >> its because , each array in array of arrays is an differnt object
        // 6. arr.length >> means the length of rows they are talking about
        // 7. When itreating the 2d array the outer for loop iterates over each row and in the inner one over each column of each row
        // 8.arr[i].length - this is in the case of mixed no of columns in each row
    
