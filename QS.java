package com.irinaserova;
//Choose a pivot value. We take the value of the middle element as pivot value,
//but it can be any value, which is in range of sorted values, even if it doesn't present in the array.
//Partition. Rearrange elements in such a way, that all elements which are lesser 
//than the pivot go to the left part of the array and all elements greater than the pivot,
//go to the right part of the array. Values equal to the pivot can stay in any part of the array. Notice, that array may be divided in non-equal parts.
//Sort both parts. Apply quicksort algorithm recursively to the left and the right parts.
import java.util.*;

public class QS {
    
	private static Scanner in;

	public static void printArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int a : arr) {
			sb.append(a + " ");
		}
		System.out.println(sb.toString());
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int partition(int[] a, int start, int end) {
		int pIndex = start;
		int pivot = a[end];
		for (int i = start; i < end; i++) {
			if (a[i] <= pivot) {
				swap(a, i, pIndex);
				pIndex++;
			}
		}
		swap(a, pIndex, end);
        	printArray(a);
		return pIndex;
	}

	public static void quickSort(int[] a, int start, int end) {
		if (start < end) {
			int pIndex = partition(a, start, end);
			quickSort(a, start, pIndex - 1);
			quickSort(a, pIndex + 1, end);
		}
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
        
        	int n = in.nextInt(); 
        	int[] a = new int[n];
        	for (int i = 0; i < n; i++) {
            		a[i] = in.nextInt();
        	}

		quickSort(a, 0, n - 1);
	}
}