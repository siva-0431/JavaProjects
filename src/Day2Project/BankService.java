package Day2Project;

public class BankService {
    BankAccount account = new BankAccount();
    boolean accountCreated = false;

    public void createAccount(int accountNumber, String holderName,
                              String accountType, double balance) {

        account.accountnumber = accountNumber;
        account.holdername = holderName;
        account.accounttype = accountType;
        account.balance = balance;

        accountCreated = true;

        System.out.println("Account Created Successfully!");
    }

    public void deposit(double amount) {

        if (accountCreated) {
            System.out.println("Please create an account first.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount!");
            return;
        }

        account.balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {

        if (accountCreated) {
            System.out.println("Please create an account first.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Withdraw Amount!");
            return;
        }

        if (amount > account.balance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        account.balance -= amount;
        System.out.println("Amount Withdrawn Successfully!");
    }

    public void displayAccount() {

        if (!accountCreated) {
            System.out.println("Please create an account first.");
            return;
        }

        System.out.println("\n===== Account Details =====");
        System.out.println("Account Number : " + account.accountnumber);
        System.out.println("Holder Name    : " + account.holdername);
        System.out.println("Account Type   : " + account.accounttype);
        System.out.println("Balance        : " + account.balance);
    }
}
