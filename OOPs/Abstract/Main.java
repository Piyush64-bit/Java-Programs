package OOPs.Abstract;

public class Main {
    public static void main(String[] args) {
        Son myson = new sun(30);
        Son.carrer("Aman");
        Son.parent("Disha", 25);

        Daughter myDaughter = new Daughter(40);
        myDaughter.carrer("Rakhi");
        myDaughter.parent("Disha", 25);

        myson.hello();
        myson.normal();
    }
}
