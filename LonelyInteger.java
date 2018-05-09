package com.irinaserova;
//Consider an array of  integers, , where all but one of the integers occur in pairs. 
// In other words, every element in  occurs exactly twice except for one unique element.
//Given , find and print the unique element.

import java.util.*;
public class LonelyInteger {
    
    public static int lonelyInteger(int[] a) {
        
        int result = 0; //Create a  variable and initialize it to 0.
        
        for(int i : a) { // Iterate through each element in the array and XOR it with result.
            result = result ^ i;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        System.out.println(lonelyInteger(a)); // Print the final value of result
        
    }
}