package com.java.switchstatement;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any Number = ");
		int number = scanner.nextInt(); // 23651427
		int digit = 0;
		int sum = 0;
		int max = 1;

		/*
		 * while (number != 0) { digit = number % 10; System.out.println(digit); sum =
		 * digit+sum; number = number / 10; }
		 * System.out.println("Sum of the Digit = "+digit);
		 */

		/*
		 * while (number != 0) { digit = number % 10; if (digit == 2 || digit == 3 ||
		 * digit == 5 || digit == 7) sum = digit + sum; number = number / 10; }
		 * System.out.println("Sum of the prime Numbers = " + sum);
		 */
		
		// 12345
		while (number != 0) {
			digit = number % 10;
			
			if (digit > max) {
				max = digit;
			}
			number = number / 10;
		}
		System.out.println("Minimum Digit = "+max);
		
		
	}
}
