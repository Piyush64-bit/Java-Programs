public class Message {
    public static void message() {
        System.out.println("This ia a message box");
    }
    public static void main(String[] args) {
        System.out.println("Inside message class main");
        Greeting.messageGreeting()
    }
}