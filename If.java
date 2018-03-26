package com.irinaserova;


// Write a program that prints out a value of a number and 
// when the number reaches 4 then program ends. (use a while loop and start the number at 0)
public class If {
	public static void main(String[] args) {
		//		for(int i=0;i<10;i++) {
		//			if(i==4) {
		//				break;
		//			}
		//			System.out.println(i);
		//		}
		int i = 0;
		while(i<10) {
			System.out.println(i++);
			if(i==4) {
				break;
			}
		}
	}
}
