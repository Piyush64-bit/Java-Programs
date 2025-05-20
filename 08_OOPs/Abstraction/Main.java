// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("Animal is sleeping...😴");
    }
}

// Subclass
class Dog extends Animal {
    // Providing implementation of abstract method
    void sound() {
        System.out.println("Dog barks: Woof Woof! 🐶");
    }
}

// Main class to run
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism + Abstraction
        myDog.sound();  // Woof Woof!
        myDog.sleep();  // Sleeping...
    }
}
