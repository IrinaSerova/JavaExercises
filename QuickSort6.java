package com.irinaserova;
//
//Iterative Quick Sort
//Following is a typical recursive implementation of Quick Sort that uses last element as pivot. 
public class QuickSort6 {
	public static int[] Array={10, 34, 2, 115,7};
	static void swap(int num1, int num2){
		int temp = Array[num1];
		Array[num1] = Array[num2];
		Array[num2] = temp;
	}
	static int partition(int left, int right, int pivot){
		int low = left-1;
		int high = right;
		while(true){
			while(Array[++low] < pivot){
				
			}
			while(high > 0 && Array[--high]>pivot){
				
			}
			if(low >= high){
				break;
			}
			else{
				swap(low, high);
			}
		}
		swap(low, right);
		return low;
	}
	static void quicksort(int left, int right){
		if(right-left<=0){
			return;
		}
		else{
			int pivot = Array[right];
			int partitionPoint = partition( left,  right,  pivot);
			quicksort(left, partitionPoint-1);
			quicksort(partitionPoint+1, right);
		}
	}
	public static void traverse()
	{
		for(int i=0;i<Array.length;i++)
		{
			System.out.println(Array[i]);
		}
	}
	public static void main(String args[]){
	
		quicksort(0,Array.length-1);
		traverse();
	
	}
}