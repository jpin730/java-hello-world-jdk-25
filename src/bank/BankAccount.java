package bank;

public class BankAccount {
    private final String holder;
    private double balance;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        this.balance += amount;
        System.out.println("Deposit successful. New balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return;
        }

        this.balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + this.balance);
    }

    public void displayBalance() {
        System.out.println("Account holder: " + this.holder);
        System.out.println("Current balance: " + this.balance);
    }
}
