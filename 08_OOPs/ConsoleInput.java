import java.io.Console;

public class ConsoleInput {
    String name;
    int age;
    float grade;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Please run this in a terminal or command line.");
            return;
        }

        ConsoleInput student = new ConsoleInput();

        student.name = console.readLine("Enter name: ");
        
        try {
            String ageStr = console.readLine("Enter age: ");
            student.age = Integer.parseInt(ageStr);

            String gradeStr = console.readLine("Enter grade: ");
            student.grade = Float.parseFloat(gradeStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for age and grade.");
            return;
        }

        student.display();
    }
}