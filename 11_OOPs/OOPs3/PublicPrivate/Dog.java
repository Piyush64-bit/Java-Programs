package 11_OOPs.OOPs3.PublicPrivate;

public class Dog extends Animal {
    
    public void bark() {
        // Using getter to access private Name from Animal
        // System.out.println("Name: " + Name);
        System.out.println("Dog Barks");
        System.out.println("Age from Animal: " + age);
    }

    public void testPrivateAccess() {
        // SecretMethod(); ❌ Not allowed, it's private
        PrivateMethod() // ✅ This is allowed
    }
}
