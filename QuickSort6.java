package com.irinaserova;


public class QuickSort6 {
	public static int[] Array={85,78,14,52,25,63,99,77,42,33};
	static void swap(int num1, int num2)
	{
		int temp=Array[num1];
		Array[num1]=Array[num2];
		Array[num2]=temp;
	}
	static int partition(int left, int right, int pivot)
	{
		int lo=left-1;
		int hi=right;
		while(true)
		{
			while(Array[++lo]<pivot)
			{
				//do nothing
			}
			while(hi>0 && Array[--hi]>pivot)
			{
				//do nothing
			}
			if(lo>=hi)
			{
				break;
			}
			else
			{
				swap(lo,hi);
			}
		}
		swap(lo,right);
		return lo;
	}
	static void quicksort(int left, int right)
	{
		if(right-left<=0)
		{
			return;
		}
		else
		{
			int pivot=Array[right];
			int partitionPoint =partition( left,  right,  pivot);
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
	public static void main(String args[])
	{
	
		quicksort(0,Array.length-1);
		traverse();
	
	}
}