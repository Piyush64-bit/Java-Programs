package SelfQuestions.PublicPrivate;

public class Car {
    private String name = "ToyotaHilux";
    public int price = 4500000;
    public void CarName() {
        System.out.println("Hilix");
    }
    private void Secret() {
        System.out.println("Discount is Secret");
    }
    public void SecretAccessed() {
        Secret();
    }
    }