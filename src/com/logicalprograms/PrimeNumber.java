package com.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Welcome To Prime Number");

		// INPUT positive number greater than 1
		System.out.print("Enter positive number grater than 1 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 0) number = -number;
		System.out.println("You enterd "+number);
		
		scanner.close();
	}

}
