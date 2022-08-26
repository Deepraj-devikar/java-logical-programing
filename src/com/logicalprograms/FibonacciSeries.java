package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Welcome To Febonacci Series Program");

		System.out.print("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 0) {
			number = -number;
		}
		
		System.out.println("You enterd "+number);
		
		scanner.close();
	}

}
