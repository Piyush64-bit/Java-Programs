package OOPS.oops2.packages.b;

import static  OOPS.oops2.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
       System.out.println("Hello"); 
       message();
    }

    public static void messageGreeting() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'messageGreeting'");
    }
}


// Since both classes are in the same package, there's no need to import Greeting in Message.

// Static methods can be called using the class name, e.g., Greeting.messageGreeting();.

// Avoid circular dependency in main() methods — calling each other back and forth infinitely.