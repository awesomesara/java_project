public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(1001, "John Doe");

        account.deposit(1000);
        account.withdraw(500);
        account.deposit(200);
        account.withdraw(300);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());

        account.printTransactionHistory();
    }
}
