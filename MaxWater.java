package com.irinaserova;

//We have to maximize the Area that can be formed between 
//the vertical lines using the shorter line as length and the distance 
//between the lines as the width of the rectangle forming the area.

public class MaxWater {
	public static int maxArea(int[] height) {
		int maxarea = 0, 
		left = 0, 
		right = height.length - 1;
		while (left < right) {
			maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}
		return maxarea;
	}
	 public static void main(String[] args) {
	        int a[] = {1, 5, 4, 3};
	                     
	        System.out.print(maxArea(a));	     
	    }
}
