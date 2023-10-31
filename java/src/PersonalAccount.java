import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    /**
     * Constructor to initialize the personal account.
     * @param accountNumber Unique identifier for the account.
     * @param accountHolder The name of the account holder.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    /**
     * Deposit money into the account.
     * @param amount The amount to be deposited.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
        }
    }

    /**
     * Withdraw money from the account.
     * @param amount The amount to be withdrawn.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
        }
    }

    /**
     * Print the transaction history.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account Number " + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    /**
     * Retrieve the current balance of the account.
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieve the account number.
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Retrieve the account holder's name.
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }
}
