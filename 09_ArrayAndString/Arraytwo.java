import java.util.Scanner;
public class Arraytwo {
    public static void main(String[] args) {
        //taking input from the user 
        Scanner in = new Scanner(System.in);
        int [] arr = new int [5];
        //using foor loop,
        for (int i = 1; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //enhanced loop,
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
