import java.util.Arrays;

public class StringSeven {

    public static void main(String[] args) {
        // string method 1 in JAVA
        String name = "John Doe";
        System.out.println(Arrays.toString(name.toCharArray()));

        // string method 2 in JAVA
        System.out.println("Length: " + name.length());

        // string method 3 in JAVA
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // string method 4 in JAVA
        System.out.println("Index of o: " + name.indexOf('o'));

        // string method 5 in JAVA
        System.out.println("Replace 'o' with 'a': " + name.replace('o', 'a'));

        // string method 6 in JAVA
        System.out.println("Substring(1, 3): " + name.substring(1, 3));
    }
}
