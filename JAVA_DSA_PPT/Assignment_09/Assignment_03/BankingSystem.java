public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Satyam Rathore", 5000.0);

        // Retrieve account holder name and balance
        String accountHolderName = account.getAccountHolderName();
        double balance = account.getBalance();

        // Display account details
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
