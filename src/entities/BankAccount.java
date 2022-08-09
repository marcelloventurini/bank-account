package entities;

public class BankAccount {
  
  private String accountNum;
  private String accountHolder;
  private double balance;

  public BankAccount(String accountNum, String accountHolder, double initialDeposit) {
    this.accountNum = accountNum;
    this.accountHolder = accountHolder;
    deposit(initialDeposit);;
  }

  public BankAccount(String accountNum, String accountHolder) {
    this.accountNum = accountNum;
    this.accountHolder = accountHolder;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
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

  public String toString() {
    return "Account: " + accountNum + "; Holder: " + accountHolder + "; Balance: " + balance;
  }
}
