package com.irinaserova;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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