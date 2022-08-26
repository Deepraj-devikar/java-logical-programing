package com.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To Reverse Number Program");
		
		// INPUT number
		System.out.print("Enter number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("You entered "+number);
		
		scanner.close();
	}

}
