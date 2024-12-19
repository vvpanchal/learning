package algo;

public class NumberOfIslands {

	public static void main(String[] args) {
		ScratchPad a = new ScratchPad();

	}
	
	public int numIslands(char[][] grid) {
        
       if (grid == null || grid.length == 0) return 0;
       int res = 0;
		
		// initialize visited array
		int  [] [] visited = new int [grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				visited[i][j] = 0;
			}
		}
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (visited[i][j] == 1) continue;
				if (grid[i][j] == '0') {
					visited[i][j] = 1;
					continue;
				}
				res++;
				updateIsland (grid, visited, i, j);
			}
		}
		
		
		return res;
	}
		
	static void updateIsland (char [][] arr, int [] [] visited, int m, int n) {
		
		visited[m][n] = 1;
		if (arr[m][n] == '1') arr[m][n] = 'a';
		if (m+1 < arr.length && visited[m+1][n] == 0 && arr[m+1][n] == '1') updateIsland (arr, visited, m+1,n);
		if (m-1 >= 0 && visited[m-1][n] == 0 && arr[m-1][n] == '1' ) updateIsland (arr, visited, m-1,n);
		if (n+1 < arr[0].length && visited[m][n+1] == 0 && arr[m][n+1] == '1' ) updateIsland (arr, visited, m,n+1);
		if (n-1 >= 0 && visited[m][n-1] == 0 && arr[m][n-1] == '1' ) updateIsland (arr, visited, m,n-1);
		
	}

}
