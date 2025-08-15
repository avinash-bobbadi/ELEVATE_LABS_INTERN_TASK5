import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("Account Opened", initialBalance, balance));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount, balance));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, balance));
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void displayTransactions() {
        System.out.println("Transaction History for " + accountHolderName + ":");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }
}
