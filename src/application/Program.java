package application;

import java.util.Scanner;

import entities.BankAccount;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BankAccount bankAccount;
    
    System.out.print("Enter the account number: ");
    String acc = scanner.nextLine();

    System.out.print("Enter the account holder: ");
    String holder = scanner.nextLine();
    
    System.out.print("Is there an initial deposit? (y/n) ");
    char ans = scanner.next().charAt(0);
    if (ans == 'y') {
      System.out.print("Enter initial deposit value: ");
      double initialDep = scanner.nextDouble();
      bankAccount = new BankAccount(acc, holder, initialDep);
    } else {
      bankAccount = new BankAccount(acc, holder);
    }

    System.out.println("Account data: ");
    System.out.println(bankAccount);

    System.out.print("Enter a deposit value: ");
    double newDeposit = scanner.nextDouble();
    bankAccount.deposit(newDeposit);
    System.out.println("Updated deposit data: ");
    System.out.println(bankAccount);

    System.out.print("Enter a withdraw value: ");
    double newWithdraw = scanner.nextDouble();
    bankAccount.withdraw(newWithdraw);
    System.out.println("Updated deposit data: ");
    System.out.println(bankAccount);

    scanner.close();
  }
}
