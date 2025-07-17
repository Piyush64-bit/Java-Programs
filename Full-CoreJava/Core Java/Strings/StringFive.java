package Strings;

public class StringFive {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i<26;i++ ){
            char ch = (char)('a'+i);
            series = series+ch;
        }
        System.out.println(series);
    }
}

// after 1st iteration  - "" > "a"
// after 2nd iteration - "a" > "ab"... so on
// as we know that strings are immutable in java, on every iteration of the loop a new string object is created and the old values of the object are being copied to the new one.
// this is not an optimal solution for the performance as the old objects are getting dereferenced everytime i am adding a new string object
// Total wastage of space - a, ab,abc,abcd,abcde... till 26 because only the 26 th one matters to me
// Time complexity - 0(N square)
// The only solution to this is an is there a datatype which can allow me to modify its value ??? Strings are immutable and they can not be modified once created.
// Teh solution is an -StringBuilder class
