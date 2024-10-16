package com.java.inheritance;

class Account {
	private String accountNo;
	private String accountHolderName;
	private String accountType;
	private int accountBalance;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
}

 class Transaction {
	 
		public void deposit(Account account, int amount) {
			
			int totalBalance = account.getAccountBalance() + amount;

			account.setAccountBalance(totalBalance);

			System.out.println("Transaction Details.............");
			System.out.println("---------------------------------");
			System.out.println("Transaction Id = " + " TRN - 123");
			System.out.println("Account No = " + account.getAccountNo());
			System.out.println("Account Holder Name = " + account.getAccountHolderName());
			System.out.println("Account Type = " + account.getAccountType());
			System.out.println("Account Balance = " + account.getAccountBalance());
			System.out.println("Transaction Type = " + " DEPOSIT");
			System.out.println("Transaction Status = " + " SUCCESS");
		}
	}

public class Test4 {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccountNo("ABC-123");
		account.setAccountHolderName("Anand");
		account.setAccountType("CURRENT");
		account.setAccountBalance(1000);
		
		Transaction transaction = new  Transaction();
		transaction.deposit(account, 1000);
		
	}
	
}
