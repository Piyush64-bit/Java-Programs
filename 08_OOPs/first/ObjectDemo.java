package first;
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Bob";
        s1.age = 25;
        s1.grade = 85.5;

        s2.name = "Alice";
        s2.age = 30;
        s2.grade = 90.0;

        s1.displayInfo();
        s2.displayInfo(); 
    }
}

class Student {
    String name;
    int age;
    double grade;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}