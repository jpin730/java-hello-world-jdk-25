package bank;

import java.util.Scanner;

public class BankApp {
    private final BankAccount account;
    private final Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            this.displayMenu();
            option = this.getUserOption();
            this.processOption(option);
        } while (option != 4);
    }

    private void displayMenu() {
        System.out.println("\nBank Account Menu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("4. Exit");
    }

    private int getUserOption() {
        System.out.print("Choose an option: ");
        return this.scanner.nextInt();
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                this.handleDeposit();
                break;
            case 2:
                this.handleWithdraw();
                break;
            case 3:
                this.account.displayBalance();
                break;
            case 4:
                System.out.println("Exiting the application. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void handleDeposit() {
        System.out.print("Enter amount to deposit: ");
        double depositAmount = this.scanner.nextDouble();
        this.account.deposit(depositAmount);
    }

    private void handleWithdraw() {
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = this.scanner.nextDouble();
        this.account.withdraw(withdrawAmount);
    }
}
