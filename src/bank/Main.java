package bank;

public class Main {
    static void main() {
        BankAccount account = new BankAccount("John Doe", 1000.0);
        BankApp app = new BankApp(account);
        app.start();
    }
}
