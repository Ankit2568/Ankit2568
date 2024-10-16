package com.java.static_non_static__members;

public class Accounts {
	
	private String accountNo; // 1001			2002
	private String accountName; // ICICI BANK	KarnatakBank
	private String accountType; // Saving		Saving
	
	
	public Accounts(String accountNo, String accountName, String accountType) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountType = accountType;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	

}
