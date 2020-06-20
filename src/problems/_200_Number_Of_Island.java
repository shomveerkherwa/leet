package problems;

/*Given a 2d grid map of'1's(land)and'0's(water),count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.
*/

/*
	Input:
	11000
	11000
	00100
	00011

	Output: 3
*/
public class _200_Number_Of_Island {

	public static void main(String[] args) {
		int[][] grid = { {1,1,0,0,0}, {1,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,1} };
		int islandCount = numIslands(grid);
		System.out.println("Total Number of island : "+islandCount);
	}
	
	public static int numIslands(int[][] grid) {
		int count = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1) {
					count= count+1;
					BreadthSearchAndMarkZero(grid, i, j);
				}
			}
		}
		return count;
	}

	private static void BreadthSearchAndMarkZero(int[][] grid, int i, int j) {
		
		if(i >= grid.length || i < 0 || j >= grid[i].length  || j<0 || grid[i][j] == 0)
			return;
		grid[i][j] = 0; // to consider it as visited.
		BreadthSearchAndMarkZero(grid,  i+1,  j);
		BreadthSearchAndMarkZero(grid,  i-1,  j);
		BreadthSearchAndMarkZero(grid,  i,  j+1);
		BreadthSearchAndMarkZero(grid,  i,  j-1);
	}
}
