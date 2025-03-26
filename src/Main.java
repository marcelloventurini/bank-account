import entities.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the account holder: ");
        String holder = scanner.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char ans = scanner.nextLine().charAt(0);

        if (ans == 'y') {
            System.out.print("Enter the initial deposit: ");
            double initialDeposit = scanner.nextDouble();

            bankAccount = new BankAccount(holder, accountNumber, initialDeposit);
        } else {
            bankAccount = new BankAccount(holder, accountNumber);
        }

        System.out.println("Account data:");
        System.out.println(bankAccount);

        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        bankAccount.deposit(deposit);

        System.out.println(bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        bankAccount.withdraw(withdraw);

        System.out.println(bankAccount);

        scanner.close();
    }
}
