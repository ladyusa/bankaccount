package bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance < amount)
            throw new IllegalStateException("Balance must be more than amount");
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive");
        this.balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
