import java.util.Scanner;
public class BioPrinter {
    public static void main(String[] args) {
        // Scanner object for taking input
        Scanner input = new Scanner(System.in);

        // Asking for user's name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Asking for user's age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        // Asking for user's hobby
        System.out.print("Enter your hobby: ");
        String hobby = input.nextLine();

        // Displaying the personalized bio
        System.out.println("\n--- Your Personalized Bio ---");
        System.out.println("Hey there! I'm " + name + ".");
        System.out.println("I'm " + age + " years old and I absolutely love " + hobby + "!");
        System.out.println("Nice to meet you! 😊");

        // Closing the scanner
        input.close();
    }
};