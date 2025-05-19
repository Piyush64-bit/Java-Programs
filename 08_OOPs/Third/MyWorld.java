class Animal {
    void Sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @ Override
    void Sound() {
        System.out.println("Dog barks: ");
    }
}
public class MyWorld {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.Sound();
    }
}