class Person {
    void display(Person p) {
        System.out.println("displ.obj " + p);
    }

    void show() {
        display(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.show();
    }
}
