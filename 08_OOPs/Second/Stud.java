class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Stud {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Piyush");
        s1.display();
    }
}
