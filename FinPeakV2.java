package com.irinaserova;

// Recursive Binary Search
public class FinPeakV2 {
	public static int findPeakElement(int[] nums) {
		return search(nums, 0, nums.length - 1);
	}
	public static int search(int[] nums, int l, int r) {
		if (l == r)
			return l;
		int mid = (l + r) / 2;
		if (nums[mid] > nums[mid + 1])
			return search(nums, l, mid);
		return search(nums, mid + 1, r);
	}
	public static void main (String[] args){
        int nums[] = {1, 3, 20, 4, 1, 0};
        
        System.out.println("Index of a peak point is " +
        		findPeakElement(nums));
    }
}
// Time complexity : O\big(log_2(n)\big)O(log​2(n))