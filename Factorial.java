package com.irinaserova;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if (n==1) { // base case
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(factorial(n));
	}
}


