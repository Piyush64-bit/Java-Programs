class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        System.out.println("Dog Control");
    }
}

public class SuperAnimal {
    public static void main(String[] args) {
        Dog tom = new Dog("Buddy");
    }
}
