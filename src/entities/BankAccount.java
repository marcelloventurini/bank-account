package entities;

public class BankAccount {
    private String holder;
    private String accountNumber;
    private double balance;

    public BankAccount(String holder, String accountNumber) {
        this.holder = holder;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String holder, String accountNumber, double initialDeposit) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return String.format("Account: %s; Holder: %s; Balance: %.2f", accountNumber, holder, balance);
    }
}
