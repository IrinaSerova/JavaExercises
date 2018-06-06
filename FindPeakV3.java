package com.irinaserova;

public class FindPeakV3 {
    public static int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
    public static void main (String[] args){
        int nums[] = {1, 3, 20, 4, 1, 0};
        
        System.out.println("Index of a peak point is " +
        		findPeakElement(nums));
    }
}
