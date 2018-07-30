package com.irinaserova;

public class MyQuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length <= 1 || low >= high)
            return;
        int i = low;
        int j = high;
        int midInArray = arr[(low + high) / 2];
        while (i <= j) {
            while (arr[i] < midInArray)
                ++i;
            while (arr[j] > midInArray)
                --j;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = arr[i];
                ++i;
                --j;
            } else if (i == j){
                ++i;
            }
        }
        quickSort(arr, low, j);
        quickSort(arr, i, high);
    }

    public static void main(String[] args){
        int[] array = new int[]{1, 3, 2};
        quickSort(array, 0, array.length - 1);
    }
}