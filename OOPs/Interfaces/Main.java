//defiing an interface 
interface Animal {
    //abstract methods
    void sound();
    void eat();
}
//creating a class that implements the interface
class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
    @Override
    public void eat(){
        System.out.println("Dog eat bones");
    }
}

public class Main{
    public static void main(String[] args) {
        Animal mydog = new Dog();
        mydog.sound();
        mydog.eat();
    }
}