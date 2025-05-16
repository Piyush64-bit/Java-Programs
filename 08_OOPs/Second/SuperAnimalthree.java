class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    void eat() {
        super.eat();
        System.out.println("Dog eats Bones");
    }
}

public class SuperAnimalthree {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.eat();
    }
}
