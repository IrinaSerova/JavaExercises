package com.irinaserova;

public class IndexArray {
	public static int findIdex(int[] array, int t) {
		if(array == null) return -1;
		int length = array.length;
		int index = 0; 
		while (index < length) {
			if (array[index] == t) return index;
			else index =+ 1;
			}
		return -1;
		}		
	
public static void main(String[]arg) {
	int[] array = {3,45,6,78,6,8,45};
	System.out.println("Index position of 25 is: " + findIdex(array, 25));
	System.out.println("Index position of 77 is: " + findIdex(array, 77));

}
}
