package com.irinaserova;
// Linear Scan
//nums[j] and nums[j + 1]nums[j+1] are never equal
// if it is larger than the next number nums[i+1]nums[i+1] for determining 
// if nums[i]nums[i] is the peak element
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
//Time complexity : O(n)O(n). We traverse the numsnums array of size nn once only.

