package com.logicalprograms;

import java.util.Scanner;

public class Coupon {
	
	public static void main(String[] args) {
		System.out.println("Welcome To Coupon Program");

		// Input how many coupons to generate
		System.out.print("How many coupons you have to genrate : ");
		Scanner scanner = new Scanner(System.in);
		int numberOfCoupons = scanner.nextInt();
		if (numberOfCoupons < 0) numberOfCoupons = -numberOfCoupons;
		System.out.println("You have to genrate "+numberOfCoupons+" coupons");
		
		scanner.close();
	}

}
