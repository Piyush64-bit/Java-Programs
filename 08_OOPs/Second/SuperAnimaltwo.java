class Animal {
    String type = "Generic Animal";
}

class Dog extends Animal {
    String type = "Dog";

    void printing() {
        System.out.println("Sub Class Type: " + type); 
        System.out.println("Parent Class Type: " + super.type); 
    }
}

public class SuperAnimaltwo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.printing();
    }
}
