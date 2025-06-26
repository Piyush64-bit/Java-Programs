package OOPs.Abstract;

public abstract class Parent {
    int age;
    final int Value;

    public int Parent(int age){
        this.age = age;
        Value = 24356;
    }
    // creating a static method
    static void hello() {
        System.out.println("Hey");
    }
    // creating a normal method 
    void normal() {
        System.out.println("This is normal");
    }
    abstract void carrer(String name);
    abstract void parent(String name, int age);

}
