package com.irinaserova;


import java.util.*;

public class Fibonacci {

//    public static int fibonacci(int n) {
//    	 ? : Ternary Operator
//    		return (n > 2) ? fibonacci(n - 1) + fibonacci(n - 2) : 1;    
//    }
    
    public static int fibonacci(int n) {
    	    if (n<2) { // base case
    	    	return 1;
    	    }
    	    else {
    	    	return fibonacci(n-1) + fibonacci(n-2);
    	    }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}