
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

        System.out.println("laksh" + new ArrayList<>());

        // you'll see an empth array

        // System.out.println(newInteger() + newArraylist<>());
    }e
}
