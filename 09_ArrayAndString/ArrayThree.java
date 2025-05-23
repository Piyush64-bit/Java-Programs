
import java.util.Arrays;
import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of string object 
        String[] Str = new String[4];
        for(int i = 0; i < Str.length; i++) {
            Str [i] = in.next();
        }
        System.out.println(Arrays.toString(Str));
        // after modifing the array

        Str[1] = "Laksh";
        System.out.println(Arrays.toString(Str));
        in.close();
    }
}
