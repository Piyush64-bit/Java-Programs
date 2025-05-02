import java.util.Scanner;

public class SwitchCaseDemoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int limit = sc.nextInt();

        int count = 1;
        System.out.println("Using while loop:");
        while (count <= limit) {
            System.out.println("count: " + count);
            count++;
        }

        System.out.println("Using do-while loop:");
        count = 1;
        do {
            System.out.println("count: " + count);
            count++;
        } while (count <= limit);

        sc.close();
    }
}
