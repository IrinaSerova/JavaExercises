package com.irinaserova;
//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.

public class Matrix {

	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null || matrix.length==0 || matrix[0].length==0) 
			return false;

		int m = matrix.length;
		int n = matrix[0].length;

		int start = 0;
		int end = m*n-1;

		while(start<=end){
			int mid=(start+end)/2;
			int midX=mid/n;
			int midY=mid%n;

			if(matrix[midX][midY]==target) {
				System.out.print(target + " Found");
				return true;
			}

			if(matrix[midX][midY]<target){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		System.out.print("n Element not found");
		return false;
		
	}
	 public static void main(String[] args) {
         int mat[][] = { {10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50} };
          
         searchMatrix(mat, 20);
      }
         
}

