package com.cg.add;

import java.util.Scanner;

public class mult {
	
	private static Scanner sc;

	public static void main(String[] args) {
		int Number1, Number2, mul;
		sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter the First integer Value: ");
		Number1 = sc.nextInt();

		System.out.println("\n Please Enter the Second integer Value: ");
		Number2 = sc.nextInt();
		
		mul = Number1 * Number2;
		System.out.println("\n Sum of the two integer values is = " + mul);
		
		
	}

}

