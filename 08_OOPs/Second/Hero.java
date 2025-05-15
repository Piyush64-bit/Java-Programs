class Animal {
    void eat() {
        System.out.println("This animal eats foods");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class Hero {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
};
