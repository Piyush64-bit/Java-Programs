public class Book {
 String title;
 Book() {
    title = "Hello World!";
 }   
 void display() {
    System.out.println("Title: " + title);
 }
}
public class main {
    public static void main(String[] args) {
        Book b = new Book();
        b.display();
    }
}

// public class Basic {
//     public static void main(String[] args) {
//         // Creating objects using different constructors
//         Student student1 = new Student();  // Using default constructor
//         Student student2 = new Student("John", 20);  // Using parameterized constructor
        
//         // Displaying student information
//         student1.displayInfo();
//         student2.displayInfo();
//     }
// }

// class Student {
//     String name;
//     int age;
    
//     // Default constructor
//     Student() {
//         name = "Unknown";
//         age = 0;
//         System.out.println("Default constructor called");
//     }
    
//     // Parameterized constructor
//     Student(String studentName, int studentAge) {
//         name = studentName;
//         age = studentAge;
//         System.out.println("Parameterized constructor called");
//     }
    
//     // Method to display student information
//     void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("-------------------");
//     }
// }