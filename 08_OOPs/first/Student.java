package first;
public class Student {

    String name;
    int age;
    float grade;

    // methods
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade); 
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 24;
        s1.grade = 88.5f;
        s1.display();
    }
};