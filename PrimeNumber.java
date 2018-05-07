package com.irinaserova;


import java.util.*;
// A prime is a natural number greater than  that has no positive divisors other than  and itself. 
//Given  integers, determine the primality of each integer 
//and print whether it is Prime or Not prime on a new line.


//instead of checking till n, we can check till √n because a large factor of n 
//must be a multiple of smaller factor that has been already checked.

public class PrimeNumber {

	static boolean isPrime(int n) {
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if( n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfTests = scan.nextInt();
		for (int i = 0; i < numOfTests; i++) {
			int x = scan.nextInt();
			String answer;
			if (x >= 2 && isPrime(x)) {
				answer = "Prime";
			} else {
				answer = "Not prime";
			} 
			System.out.println(answer);
			
		}
		scan.close();  
	}
}

