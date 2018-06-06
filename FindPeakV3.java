package com.irinaserova;
// Iterative Binary Search
public class FindPeakV3 {
    public static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    public static void main (String[] args){
        int nums[] = {1, 3, 20, 4, 1, 0};
        
        System.out.println("Index of a peak point is " +
        		findPeakElement(nums));
    }
}
