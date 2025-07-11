// new.java
package OOPs.GenericInterface;

class Human implements Cloneable {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human override) {
        this.age = override.age;
        this.name = override.name;
    }

    @Override // override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class New {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human S1 = new Human(20, "Groot");
        Human S2 = (Human) S1.clone();
        System.out.println("Original: " + S1.name + ", Age: " + S1.age);
        System.out.println("Cloned: " + S2.name + ", Age: " + S2.age);
    }
}