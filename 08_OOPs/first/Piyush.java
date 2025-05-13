package first;
public class Piyush {
    String name;

    Piyush(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Piyush {
    public static void main(String args[]) {
        Piyush s = new Piyush("Ravi");
        s.display();
    }
}
