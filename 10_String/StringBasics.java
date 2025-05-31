import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Print original string
        System.out.println("Your name is: " + name);

        // String length
        System.out.println("Length of your name: " + name.length());

        // Access individual characters
        System.out.println("First character: " + name.charAt(0));

        // Concatenate strings
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        // Convert to uppercase
        System.out.println("In uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("In lowercase: " + name.toLowerCase());

        // Check if name contains a letter
        System.out.println("Does your name contain 'a'? " + name.contains("a"));

        sc.close();
    }
}
