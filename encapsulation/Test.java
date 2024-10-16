package com.java.static_non_static__members;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("1st Way of Reading the the Accounts Data");
		Accounts accounts1 = new Accounts("1001","ICICI BANK","Saving");
		System.out.println(accounts1.getAccountNo());
		System.out.println(accounts1.getAccountName());
		System.out.println(accounts1.getAccountType());
		
		System.out.println();
		
		System.out.println("2nd Way of Reading the the Accounts Data");
		accounts1.setAccountNo("2002");
		accounts1.setAccountName("Karnatak BANK");
		accounts1.setAccountType("Saving");
		System.out.println(accounts1.getAccountNo());
		System.out.println(accounts1.getAccountName());
		System.out.println(accounts1.getAccountType());
		
		System.out.println();
		
		System.out.println("3rd Way of Reading the the Accounts Data");
		Employee employee1 = new Employee();
		employee1.setEno("EMP-1001");
		employee1.setEname("EMP-ABC");
		employee1.setEmail("a@b.com");
		employee1.setEsal(10000.00);
		employee1.setAcccounts(accounts1);// setting the accounts data
		System.out.println("Employee ID = "+employee1.getEno());
		System.out.println("Employee Name = "+employee1.getEname());
		System.out.println("Employee Email = "+employee1.getEmail());
		System.out.println("Employee Esal = "+employee1.getEsal());

		System.out.println();
		
		Accounts account2 =  employee1.getAcccounts();
		System.out.println(account2.getAccountNo()); // 2002
		System.out.println(account2.getAccountName()); // Karnatak Bank
		System.out.println(account2.getAccountType()); //Saving
		
		
	}
}
