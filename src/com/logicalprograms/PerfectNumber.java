package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Welcome To Perfect Number Program");

		System.out.print("Enter positive number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 0) {
			number = -number;
		}
		
		System.out.println("You entered "+number);
		
		scanner.close();
	}

}
