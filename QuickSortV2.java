package com.irinaserova;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QuickSortV2 {

	// Complete the quickSort function below.
	static int[] quickSort(int[] arr) {
		
	
		int pivot = arr[0];
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> equal = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		equal.add(pivot);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < pivot)
				left.add(arr[i]);
			else if (arr[i] == pivot)
				equal.add(arr[i]);	
			else
				right.add(arr[i]);

		}


		for(int i=0;i<left.size();i++) {
			left.add(arr[i]);
			System.out.print(left.get(i)+" ");
		}
		for(int i=0;i<equal.size();i++) {
			
			System.out.print(equal.get(i)+" ");
		}

		for(int i=0;i<right.size();i++) {
			right.add(arr[i]);
			System.out.print(right.get(i)+" ");
		}
		
		
		
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] result = quickSort(arr);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
