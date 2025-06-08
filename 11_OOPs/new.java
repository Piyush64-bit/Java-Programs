// Abstract Class (Abstraction)
abstract class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Encapsulation: private variables with public access methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("❌ Insufficient funds!");
        }
    }

    // Abstract Method (must be implemented in subclass)
    public abstract void showAccountType();
}

// Inheritance + Polymorphism
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void showAccountType() {
        System.out.println("🏦 This is a Savings Account.");
    }
}

// Another Subclass for variety
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void showAccountType() {
        System.out.println("💼 This is a Current Account.");
    }
}

// Main Class to Run It
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Piyush", 1000);
        BankAccount acc2 = new CurrentAccount("Soni", 2000);

        acc1.deposit(500);
        acc2.withdraw(1500);

        System.out.println(acc1.getAccountHolder() + "'s balance: ₹" + acc1.getBalance());
        acc1.showAccountType();

        System.out.println(acc2.getAccountHolder() + "'s balance: ₹" + acc2.getBalance());
        acc2.showAccountType();
    }
}
