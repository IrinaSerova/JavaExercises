package com.irinaserova;
// Longest Increasing Subsequenc

public class LIv2 {
	public static int lengthLI(int[] nums) {
        return lengthLI(nums, Integer.MIN_VALUE, 0);
    }

    public static int lengthLI(int[] nums, int prev, int curr) {
        if (curr == nums.length) {
            return 0;
        }
        int taken = 0;
        if (nums[curr] > prev) {
            taken = 1 + lengthLI(nums, nums[curr], curr + 1);
        }
        int nottaken = lengthLI(nums, prev, curr + 1);
        return Math.max(taken, nottaken);
    }
    public static void main(String args[]){
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Length of lis is "
                           + lengthLI(arr) + " n");
    }
}
