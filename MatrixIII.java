package com.irinaserova;

public class MatrixIII {

	public static boolean searchMatrix(int[][] matrix, int target) {
		int i=matrix.length-1;
		int j=0;
		while(i >= 0 && j < matrix[0].length) {
			if(matrix[i][j] == target) {
				System.out.print(target + " found at row "+ i + "  and column "  + j);
				return true;
			}
			else if(matrix[i][j] > target) i--;
			else j++;
		}
		System.out.print("n Element not found");
		return false;
	}
	public static void main(String[] args) {
		
		int mat[][] = { {10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50} };
		

		searchMatrix(mat, 29);
	}
	
}

