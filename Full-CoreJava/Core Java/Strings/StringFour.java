package Strings;

import java.util.ArrayList;

public class StringFour {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        // 1. The operator behind the scences is converting these alphabets into their ascii value form
        System.out.println("a"+"b");
        // 2. in this case, string concatenation is taking place here
        System.out.println((char) ('a'+4));
        // 3. a. now, string will not be converting to the ascii value, then what will be happening below - 
        System.out.println("a"+ 1);
        // 3 .b. >>Note -  integer will be converted to the integer that will call toString()
        System.out.println("Laksh"+ new ArrayList<>());
        // 4. for the above one you will see an empty array
         System.out.println(new Integer(56) + new ArrayList<>());
        //  5. for the above one - you will be seeing an error because the operator(+) in java is only defined for the primitives and if one of these values is a string. The above thins (before + and after) is an complete experession, so one of them should be the string. Now , if we add an empty string - 
        System.out.println(new Integer(56) + ""+ new ArrayList<>());
        // 6. with this its clear that the + operator is a part of the operator overloading in java


    }
}
