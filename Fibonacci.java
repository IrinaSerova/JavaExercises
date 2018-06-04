package com.irinaserova;


import java.util.*;

public class Fibonacci {

    public static int fibonacci(int n) {

return (n > 2) ? fibonacci(n - 1) + fibonacci(n - 2) : 1;
        // Complete the function.
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}