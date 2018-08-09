package com.irinaserova;
//Write a Java program to count the letters, 
// spaces, numbers and other characters of an input string.

public class StringCounter {
	public static String test = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero.";
	
	public static void main(String[] args) {
		count(test);
	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num ++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				other++;
			}
		}
		System.out.println("The string is: " + test);
		System.out.println("Letters: " + letter);
		System.out.println("Spaces: " + space);
		System.out.println("Numbers: " + num);
		System.out.println("Others symbols: " + other);
		
	}
	

}
