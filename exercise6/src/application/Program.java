package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine(); // It is necessary to insert this nextLine for consume the previous line break
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.printf("Is there an initial deposit (y/n)?");
//		String choice = sc.next();
		char response = sc.next().charAt(0);
//		System.out.print(choice);
		Account account;
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, name, initialDeposit);
		} else {
			account = new Account(accountNumber, name);
		}
		System.out.println();
		System.out.printf("Account data: %n", account);
		System.out.printf("%nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.printf("%nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}
}
