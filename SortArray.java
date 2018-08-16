package com.irinaserova;
import java.util.Arrays;



public class SortArray {
	public static void main(String[] args) {
		int[] arrayFirst = {1234, 354, 46, 34564, 54, 67,45, 34, 4654};
		String[] arraySecond = {"Java", "Python", "Javascript", "PHP"};
		System.out.println("Original numeric array : "+Arrays.toString(arrayFirst));
	    Arrays.sort(arrayFirst);
	    System.out.println("Sorted numeric array : "+Arrays.toString(arrayFirst));
	    
	    System.out.println("Original string array : "+Arrays.toString(arraySecond));
	    Arrays.sort(arraySecond);
	    System.out.println("Sorted string array : "+Arrays.toString(arraySecond));
	    
	
	}
}
