import java.util.ArrayList;

public class StringFour {
    public static void main(String[] args) {
        System.out.println('a' + 'b');

        // the operator behind the scene is converting a --> ASCII values

        System.out.println("a" + "b");

        // here string concatenation is taking palce.

        System.out.println((char)('a' + 4));

        System.out.println("a" + 1);

        // integer will be converted to the integer that will call tostring()

        // System.out.println(new Integer(0) + new ArrayList<>());
        // for this , you will be seeing an error because (+) operator in java is only defined for primitive data types  & if one of these value is a strinng 

        // to correct upper case error 
        System.out.println(new Integer(0) + "  " + new ArrayList<>());
    }
}
