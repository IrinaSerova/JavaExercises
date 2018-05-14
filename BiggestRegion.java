package com.irinaserova;
// Depth-First Search (DFS) algorithm 
// modify it to assign a unique number to each cell identified in a connected component

import java.util.Scanner;

// A connected component of an undirected graph is a subgraph 
// in which every two vertices are connected to each other by a path(s),
// and which is connected to no other vertices outside the subgraph.
public class BiggestRegion {
	public static int getSize(int[][] matrix, int row, int column) {
		if (row<0 || column < 0 || row >= matrix.length || column >= matrix[row].length) {
			return 0;
		}
		if (matrix[row][column] == 0) {
			return 0;
		}
		matrix[row][column] = 0;
		int size = 1;
		for (int r = row -1; r<=row +1; r++) {
			for (int c = column  -1; c <= column + 1; c++) {
				if (r != row || c != column) {
					size +=getSize(matrix, r, c);
				}
			}
		}
		return size;
	}
	
	public static int getBiggestRegion (int[][] matrix) {
		int maxRegion = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				if (matrix[row][column] == 1) {
					int size = getSize(matrix, row, column);
					maxRegion = Math.max(size,  maxRegion);
				}
			}
			
		}
		return maxRegion;
	}
	 /** Problem Setup **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {          
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        DFS solution = new DFS(n, m, matrix);
        System.out.println(solution.solve());
        
    }
}
