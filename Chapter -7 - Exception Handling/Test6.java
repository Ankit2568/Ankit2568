package com.java.exceptionHandling;

import java.io.IOException;

 

class Account {

	public String accountNumber;
	public String accountName;
	public String accountType;
	public int balance;

	public Account(String accountNumber, String accountName, String accountType, int balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

}
class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}

	

}

class Transation {
	public void withdraw(Account account, int withdrawAmount) {
		System.out.println("Transaction Details");
		System.out.println("----------------------");
		System.out.println("Account Number = " + account.accountNumber);
		System.out.println("Account Name = " + account.accountName);
		System.out.println("Account Type = " + account.accountType);
		System.out.println("Transaction Type : WITHDRAW");
		System.out.println("Withdraw Amount = " + withdrawAmount);

		try {
			if (account.balance > withdrawAmount) {
				account.balance = account.balance - withdrawAmount;
				System.out.println("Total balance = " + account.balance);
				System.out.println("Transaction Status : SUCCESSFULL");
			} else {
				System.out.println("Total balance = " + account.balance);
				System.out.println("Transaction Status : FAILURE");

				throw new InsufficientFundsException(
						"FUNDS ARE NOT SUFFICIENT IN YOUR ACCOUNT! PLEASE ENTER VALID WITHDRAW AMOUNT");

			}
		} catch (InsufficientFundsException exception) {
			System.out.println(exception.getMessage());
		} finally {
			System.out.println("---------------THANKYOU VISIT AGAIN---------------");
		}

	}
}

public class Test6 {

	public static void main(String[] args) {
		Account account1  =  new Account("ABC123", "ABCXYZ123", "SAVING", 10000);
		Transation transaction1 = new Transation();
		transaction1.withdraw(account1, 5000);;
		System.out.println();

		Account account2  =  new Account("XYZ123", "ABCXYZ456", "SAVING", 10000);
		Transation transaction2 = new Transation();
		transaction1.withdraw(account2, 50000);;
		System.out.println();
		
	}

}
