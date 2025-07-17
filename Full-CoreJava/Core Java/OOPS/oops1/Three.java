package OOPS.oops1;

public class Three {
    public static void main(String[] args) {
        //1. Now, creating two objects and pointing to each other is like the reference variables are pointing towards the same object behind the scenes 
        //> for ex- Student one = new Student(), Student two = one;
        Student one = new Student();
        Student two = one;

        // Assign values using 'one'
        one.name = "Something-something";
        one.age = 20;
        one.marks = 85.5f;

        // Print values using 'two'
        System.out.println("two.name: " + two.name);
        System.out.println("two.age: " + two.age);
        System.out.println("two.marks: " + two.marks);

        // Modify values using 'two'
        two.name = "Changed Name";
        two.age = 22;
        two.marks = 90.0f;

        // Print values using 'one' to show both references point to the same object
        System.out.println("one.name: " + one.name);
        System.out.println("one.age: " + one.age);
        System.out.println("one.marks: " + one.marks);

        // Check if both references are equal
        System.out.println("Are 'one' and 'two' referring to the same object? " + (one == two));
    }
}

class Student {
    String name;
    int age;
    float marks;
}
