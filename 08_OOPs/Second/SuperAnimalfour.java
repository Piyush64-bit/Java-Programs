class Hyena {
    Hyena() {
        System.out.println("Hyena Here");
    }
}

class Sherkhan extends Hyena {
    Sherkhan() {
        // super() is called implicitly
        System.out.println("Sherkhan Here");
    }
}

public class SuperAnimalfour {
    public static void main(String[] args) {
        Sherkhan ChildOne = new Sherkhan();
    }
}
