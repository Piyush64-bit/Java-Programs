// File: Message.java
package OOPS.oops2.packages.b;

public class Message {
    public static void message() {
        System.out.println("This is the message box");
    }

    public static void main(String[] args) {
        System.out.println("Inside Message class main()");
        
        // Call the static method from Greeting class
        Greeting.messageGreeting(); // No need to import if in same package
    }
}
