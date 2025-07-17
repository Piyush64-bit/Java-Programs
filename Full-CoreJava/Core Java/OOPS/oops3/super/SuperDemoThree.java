// Superclass
class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
        System.out.println("Payment created for amount: " + amount);
    }

    void pay() {
        System.out.println("Processing generic payment...");
    }
}

// Subclass
class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount); // call parent constructor
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        super.pay(); // call parent method first
        System.out.println("Processing credit card payment with card: " + cardNumber);
    }
}

public class SuperDemoThree {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment(1000, "1234-5678-9876-5432");
        ccp.pay();
    }
}


// Why super is useful here:
// Calls the parent constructor to initialize the base part of the object.

// Calls the parent's method before adding custom logic.


