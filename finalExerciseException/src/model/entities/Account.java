package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
//		if (withdrawLimit > balance) {
//			throw new DomainException("The withdraw limit is greater than the initial balance");
//		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) throws DomainException {
		if (amount > getWithdrawLimit()) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}
}
