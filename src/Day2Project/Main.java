package Day2Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService();

        int choice;

        do {

            System.out.println("\n===== BANK ACCOUNT MANAGEMENT =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String holderName = scanner.nextLine();

                    System.out.print("Enter Account Type: ");
                    String accountType = scanner.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();

                    bankService.createAccount(accountNumber, holderName, accountType, balance);
                    break;

                case 2:

                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();

                    bankService.deposit(depositAmount);
                    break;

                case 3:

                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    bankService.withdraw(withdrawAmount);
                    break;

                case 4:

                    bankService.displayAccount();
                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}