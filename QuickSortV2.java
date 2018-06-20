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
    int temp=0;
    int pivot=arr[0];
    int pivotIndex=arr.length-1;
    for(int i=arr.length-1;i>=1;i--){
        if(arr[i]>=pivot){
            temp=arr[i];
            arr[i]=arr[pivotIndex];
            arr[pivotIndex]=temp;
            pivotIndex-=1;
        }
    }
    temp=arr[pivotIndex];
    arr[pivotIndex]=arr[0];
    arr[0]=temp;
    System.out.print(arr);
	return arr;  

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
