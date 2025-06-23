package 11_OOPs.OOPs3.PublicPrivate;

public class Animal {
    private String Name = "Genric Animal";// Private: not accessible outside this class
    public int Age = 5;
    public void displayAge() {
        System.out.println("Age" + Age);// Public: accesible anywhere
    }
    private void SecretMethod() {
        System.out.println("This is a private method in animal");
    }
    public void PrivateMethod() {
        SecretMethod();//you can call a function from a private
    }
}
