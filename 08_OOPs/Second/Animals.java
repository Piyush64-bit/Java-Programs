class Animal {
    void eat() {
        System.out.println("animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("doggy");
    }
}

class Puppy extends Dog {
    void Weep() {
        System.out.println("Weeping");
    }
}

public class Animals {
    public static void main(String[] args) {
        Puppy Tom = new Puppy();

        Tom.Weep();
        Tom.bark();
        Tom.eat();
    }
};
