// Abstraction + Encapsulation
class Animal {
    private String name; // Encapsulation: private + getters/setters

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() { // Polymorphism: overridden in subclass
        System.out.println("Animal is making a sound...");
    }
}

// Inheritance
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calling parent constructor
    }

    // Polymorphism: method overriding
    @Override
    public void speak() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

// Main class to test OOP concepts
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("GenericAnimal");
        Dog myDog = new Dog("Bruno");

        myAnimal.speak(); // Output: Animal is making a sound...
        myDog.speak();    // Output: Bruno says: Woof Woof!
    }
}
