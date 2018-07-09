package com.irinaserova;

// count all possible paths from top left to bottom right to reach 
// cell at row number a and column number b

public class GridPath {
	public static int uniquePaths(int a, int b) {
		// 1 row or 1 column 
		if(a==1 || b==1)
			return 1;

		// If diagonal movements are allowed then reduce one row or one column and add to the answer.
		else{
			int paths = 0;
			paths = uniquePaths(a-1, b) + uniquePaths(a, b-1);
			return paths;
		}

	}
	public static void main(String args[])
	{
		System.out.println(uniquePaths(2, 1));
	}
}

