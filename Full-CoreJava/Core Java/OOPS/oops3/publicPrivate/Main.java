package OOPS.oops3.publicPrivate;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();             // Works fine
        d.displayAge();       // Accessing public method of parent
        d.testPrivateAccess();// Works - indirectly calls private method

        // System.out.println(d.name); // ❌ 'name' is private
        System.out.println("Age: " + d.age); // ✅ public field
    }
}

