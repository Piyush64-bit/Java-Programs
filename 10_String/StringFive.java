
public class StringFive {

    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }
}

// 1>
// after first iteration -" " > "a"
// after second iteration - "a" > "ab"

// 2>
// as we know, strings are immutable in jave one every iteration of the loop a new string object is created and the old value of the string are being copied to yhe new one.

// 3> 
// This is not optimal performance ar the old objects are getting derefernced everytime i am adding a new string object.

// 4>
// Total wastage of space - a, ab, abc ----  till 26 because 26th one ends this.

//5>
// Time complexity - 0(n2)

//6>
// The only soultion to this is an data type which can allow me to modify its value??
// -> Strings are immutable ---- now?
// -> String Builder class in JAVA ✔

