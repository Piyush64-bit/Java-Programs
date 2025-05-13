package first;
import java.util.Scanner;

public class NewStudent {
    String name;
    int age;
    float grade;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NewStudent student = new NewStudent();

        System.out.print("Enter name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter age: ");
        student.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter grade: ");
        student.grade = scanner.nextFloat();

        student.display(); 

        scanner.close();
    }
}
