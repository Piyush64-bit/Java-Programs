package OOPs.Abstract;

public class Son extends Parent {
    public Son(int age){
        super (age);
    }
    @Override
    void carrer(String name) {
        System.out.println(name: "going to be a data");
    }
    @Override
    void parent(String name, int age) {
        System.out.println("I love " + name + "she is " + age _ "years old.");
    }
}
