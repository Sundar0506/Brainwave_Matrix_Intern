import java.util.Scanner;

public class ATMInterface {
    private static double balance = 1000.00; // Default initial balance
    private static final String PIN = "1234"; // Default PIN for simplicity

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM Interface!");

        if (!authenticate(scanner)) {
            System.out.println("Too many failed attempts. Exiting.");
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static boolean authenticate(Scanner scanner) {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            String inputPin = scanner.next();

            if (PIN.equals(inputPin)) {
                System.out.println("Authentication successful.");
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Try again. Attempts left: " + (3 - attempts));
            }
        }
        return false;
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", balance);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. Your new balance is: $%.2f\n", amount, balance);
        } else {
            System.out.println("Invalid amount. Deposit must be greater than 0.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. Your new balance is: $%.2f\n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Withdrawal must be greater than 0.");
        }
    }
}