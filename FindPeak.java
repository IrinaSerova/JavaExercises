package com.irinaserova;

public class FindPeak {
	public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
	public static void main (String[] args){
        int nums[] = {1, 3, 20, 4, 1, 0};
        
        System.out.println("Index of a peak point is " +
        		findPeakElement(nums));
    }
}
