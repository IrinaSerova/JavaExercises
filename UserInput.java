package com.irinaserova;


import java.util.Scanner;

// Use a do while to ask the user for number as input and 
// if the number is equal to 5 then stop asking for input and print out a message.

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = 0;
		do {
			System.out.print("Please input a number: ");
			q = sc.nextInt();
			if(q!=5) {
				System.out.println("Try again");
			}
		}while(q!= 5);
		System.out.println("Finally got 5");
		sc.close();
	}
}
