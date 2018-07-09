package com.irinaserova;

public class GridPathV2 {
	// Returns count of possible paths to reach 
	// cell at row number m and column number n from
	//  the topmost leftmost cell (cell at 1, 1)
	static int uniquePaths(int a, int b){
		// Create a 2D table to store results 
		// of subproblems
		int count[][] = new int[a][b];

		// Count of paths to reach any cell in 
		// first column is 1
		for (int i = 0; i < a; i++)
			count[i][0] = 1;

		// Count of paths to reach any cell in
		// first column is 1
		for (int j = 0; j < b; j++)
			count[0][j] = 1;

		// Calculate count of paths for other 
		// cells in bottom-up manner using
		// the recursive solution
		for (int i = 1; i < a; i++){
			for (int j = 1; j < b; j++)

				// By uncommenting the last part the 
				// code calculatest he total possible paths 
				// if the diagonal Movements are allowed
				count[i][j] = count[i-1][j] + count[i][j-1]; //+ count[i-1][j-1];

		}
		return count[a-1][b-1];
	}
	public static void main(String args[]){
		System.out.println(uniquePaths(3, 3));
	}
}
