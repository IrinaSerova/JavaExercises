package com.irinaserova;

public class MatrixIII {

	public static boolean searchMatrix(int[][] matrix, int target) {
		//start twith top right element
		int i = matrix.length-1; 
		int j = 0;
		// compare the element with target
		while(i >= 0 && j < matrix[0].length) {
			if(matrix[i][j] == target) {
				System.out.print(target + " found at row "+ i + "  and column "  + j);
				return true;
			}
		//  if matrix[i][j] > target move it to left
			else if(matrix[i][j] > target) i--;
		//  if matrix[i][j] < target move it to down
			else j++;
		}
		System.out.print(target + "  not found");
		return false;
	}
	public static void main(String[] args) {
		
		int matrix[][] = { {10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50} };
		

		searchMatrix(matrix, 29);
	}
	
}
// Time Complexity: O(n)
