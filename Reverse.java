package com.irinaserova;



public class Reverse {

	public static void reversePrint(int[] numbers) {
		if (numbers.length == 0) { // base case
			return;
		}
		else {
			int[] a =new int [numbers.length -1];
			for (int i = 0; i< numbers.length -1; i++)
				a[i] =numbers[i+1];
			reversePrint(a);
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		int[] numList = {10, 20, 30};
		reversePrint(numList);
		System.out.println(" ");
	}
}


