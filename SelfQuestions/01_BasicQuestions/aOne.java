// Question to add three numbers in java

import java.util.Scanner;
public class aOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = input.nextInt();

        System.out.println("Addition of all the numbers are: " + num1 + num2 + num3);

    }
}
