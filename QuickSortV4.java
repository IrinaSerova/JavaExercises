package com.irinaserova;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QuickSortV4 {

    // Complete the quickSort function below.
   
    /** Quick Sort function **/
   	static int[] quickSort(int[] arr) {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int pivot = arr[0];
        int counterLeft = 0;
        int counterRight = 0;
        for(int i=1; i< arr.length;i++){
            if(pivot >= arr[i]){
                // left[counterLeft] = arr[i];
                // counterLeft++;
                System.out.println(arr[i]);
                left.add(arr[i]);
            }
            else{
                // System.out.println(arr[i]);
                // System.out.println(counterRight);
                right.add(arr[i]);
            }
        }
        
        for(int i=0; i< left.size();i++){
            arr[i] = left.get(i);
        }
        arr[left.size()] = pivot;
        for(int i=0; i<right.size();i++){
            arr[left.size()+1+i] = right.get(i); 
        }
        // for(int i=0; i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
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
