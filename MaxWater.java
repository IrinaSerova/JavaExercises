package com.irinaserova;

//We have to maximize the Area that can be formed between 
//the vertical lines using the shorter line as length and the distance 
//between the lines as the width of the rectangle forming the area.

public class MaxWater {
	public static int maxArea(int[] height) {
		int maxarea = 0, l = 0, r = height.length - 1;
		while (l < r) {
			maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		return maxarea;
	}
	 public static void main(String[] args) {
	        int a[] = {1, 5, 4, 3};
	        
	     
	        
	        System.out.print(maxArea(a));
	     
	    }
}
