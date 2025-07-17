// Superclass
class Animal {
  String type = "Animal";

  Animal() {
      System.out.println("Animal constructor called");
  }

  void sound() {
      System.out.println("Animal makes a sound");
  }
}

// Subclass
class Dog extends Animal {
  String type = "Dog";

  Dog() {
      super(); // calling parent constructor
      System.out.println("Dog constructor called");
  }

  void showType() {
      System.out.println("Type in child: " + this.type);
      System.out.println("Type in parent: " + super.type);
  }

  void sound() {
      super.sound(); // calling parent class method
      System.out.println("Dog barks");
  }
}

public class SuperDemo {
  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.showType();
      dog.sound();
  }
}
