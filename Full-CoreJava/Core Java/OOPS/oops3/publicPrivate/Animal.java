package OOPS.oops3.publicPrivate;



public class Animal {
    private String name = "Generic Animal"; // private: not accessible outside this class
    public int age = 5;                     // public: accessible everywhere

    public void displayAge() {
        System.out.println("Age: " + age);
    }

    private void secretMethod() {
        System.out.println("This is a private method in Animal.");
    }

    public void callPrivateMethod() {
        secretMethod();  // You can call private method inside its own class
    }
}
