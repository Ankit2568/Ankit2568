package com.java.branchingstatements;

public class Test3 {
	
	public static void main(String[] args) {
	
		for(int i =100; i<=500; i++)
		{
			if(i%10 == 4 || (i/10)%10 == 4 || (i/100)%10==4)
			{
				continue;
			}
			else {
				System.out.print(i+" ");
			}
		}
	 
	}

}

