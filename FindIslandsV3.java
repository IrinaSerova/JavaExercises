package com.irinaserova;

public class FindIslandsV3 {
	public int numIslands(char[][] grid, int i, int j) {
	    if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0)    return 0;
	    int m = grid.length, n = grid[0].length;
	    if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1')    return 0;
	    boolean[][] visited = new boolean[m][n];
	    //O(1) space: directly modify the '1' to '2' to mark grid[i][j] visited
	    return dfs(grid, visited, m, n, i, j);
	}
	private int dfs(char[][] grid, boolean[][] visited, int m, int n, int i, int j) {
	    if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') 
	        return 1; // important
	    if (visited[i][j])    return 0;
	    visited[i][j] = true;
	    return dfs(grid, visited, m, n, i + 1, j) + dfs(grid, visited, m, n, i - 1, j) + dfs(grid, visited, m, n, i, j + 1) + dfs(grid, visited, m, n, i, j - 1);
	}
}
