package com.irinaserova;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input a year: ");
		int year  = in.nextInt();
		System.out.println(Is_Leap(year));
	}
	public static boolean Is_Leap(int y) {
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		boolean c = ((y % 100 ==0) && (y % 400 == 0));
		return a && (b || c);
		
	}

}
