package com.irinaserova;

//Choose a pivot value. We take the value of the middle element as pivot value,
// but it can be any value, which is in range of sorted values, even if it doesn't present in the array.
//Partition. Rearrange elements in such a way, that all elements which are lesser 
// than the pivot go to the left part of the array and all elements greater than the pivot,
//go to the right part of the array. Values equal to the pivot can stay in any part of the array. Notice, that array may be divided in non-equal parts.
//Sort both parts. Apply quicksort algorithm recursively to the left and the right parts.

import java.util.Arrays;
import java.util.Scanner;

class QuickSort3 {
	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);

		System.out.println("Enter no of terms");
		int n = sc.nextInt();

		System.out.println("Enter the terms");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("The unsorted array is:");
		System.out.println(Arrays.toString(arr));

		sort(arr, 0, arr.length - 1);

		System.out.println("The sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int arr[], int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			sort(arr, start, pIndex - 1);
			sort(arr, pIndex + 1, end);
		}
	}

	static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, end);
		return pIndex;
	}

	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}