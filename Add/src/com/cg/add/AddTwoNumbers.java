package com.cg.add;

import java.util.Scanner;

public class AddTwoNumbers {
	
	private static Scanner sc;

	public static void main(String[] args) {
		int Number1, Number2, Sum,Diff;
		sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter the First integer Value: ");
		Number1 = sc.nextInt();

		System.out.println("\n Please Enter the Second integer Value: ");
		Number2 = sc.nextInt();
		
		Sum = Number1 + Number2;
		System.out.println("\n Sum of the two integer values is = " + Sum);
		
		Diff = Number1 - Number2;
		System.out.println("\n Difference of the two integer values is = " + Diff);
	}

}

