public class Main {

    public static void main(String[] args) {
        Son son = new Son(30);
        son.career("disha");

        son.partner(" disha ",  25);

        // calling the static method
        son.hello();
        //calling the normal method here
        son.normal();
        Daughter daughter = new Daughter(25);
        daughter.career(null);
        daughter.partner(" Harish  ",  60);
    }
}