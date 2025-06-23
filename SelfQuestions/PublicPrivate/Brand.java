package SelfQuestions.PublicPrivate;

public class Brand extends Car {
    
    public void Sound() {
        System.out.println("Vroom!!!");
        System.out.println("Car Price: " + price);
    }

    public void testSecretAccessed() {
        SecretAccessed();
    }
}
