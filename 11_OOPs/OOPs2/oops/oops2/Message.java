package oops.oops2;

public class Message {
    public static void message() {
        System.out.println("This is the message box");
    }

    public static void main(String[] args) {
        System.out.println("Inside Message class main()");
        Greeting.messageGreeting();
    }
}
        