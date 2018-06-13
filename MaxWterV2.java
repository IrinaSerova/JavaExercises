package com.irinaserova;

public class MaxWterV2 {
	public static int maxArea(int[] height) {
		int maxArea = 0;
		if (height == null || height.length <2) {
			return maxArea;
		}
		int left = 0;
		int right = height.length -1;{
			while(left < right) {
				int area = (right - left) * Math.min(height[left], height[right]);
				maxArea = Math.max(maxArea, area);
				if (height[left] < height[right]) {
					left ++;
					
				} else {
					right --;
				}
			}
		}
			return maxArea;
	}
	public static void main(String[] args) {
        int a[] = {3, 5, 7, 3};
                     
        System.out.print(maxArea(a));	     
    }
}
