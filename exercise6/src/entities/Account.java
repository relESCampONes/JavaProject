package entities;

public class Account {
	private final int ACOUNT_NUMBER;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double amount) {
		this.ACOUNT_NUMBER = accountNumber;
		this.name = name;
		deposit(amount);
	}

	public Account(int accountNumber, String name) {
		this.ACOUNT_NUMBER = accountNumber;
	}

	public int getACOUNT_NUMBER() {
		return ACOUNT_NUMBER;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}

	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", getACOUNT_NUMBER(), getName(), getBalance());
	}

}
