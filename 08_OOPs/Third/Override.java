class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void Display() {
        System.out.println("Person: " + name);
    }
}
class Student extends Person {
    double grade;

    Student(String name, double grade) {
        super(name);
        this.grade = grade;
    }
    void Display() {
        System.out.println("Student: " + name + "Grade: " + grade);
    }
} 

public class Override {
    public static void main(String[] args) {
        Person P = new Person("Alice");
        Student S = new Student("Bod", 82.5);
        P.Display();
        S.Display();
    }
}
