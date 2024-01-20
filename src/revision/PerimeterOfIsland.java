package revision;

import java.util.Arrays;

public class PerimeterOfIsland {

	public static void main(String[] args) {
		//int[][]grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int[][]grid = {{1}};
		for(int[] rows : grid) {
			System.out.println(Arrays.toString(rows));
		}
		System.out.println(islandPerimeter(grid));
	}
	
	public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length-1;
        int column = grid[0].length-1;
        
        for(int i=0; i<=row; i++) {
        	for(int j=0; j<=column; j++) {
        		if(grid[i][j] == 1) {
        			//check on top and check the edge
        			if(i > 0) {
        				if(grid[i-1][j] != 1) {
        					perimeter++;
        				}
        			} 
        			else { // meaning i am the edge
        				perimeter++;
        			}
        			
        			// check left
        			if(j > 0) {
        				if(grid[i][j-1] != 1) {
        					perimeter++;
        				}
        			} 
        			else { // meaning i am the edge
        				perimeter++;
        			}
        			
        			// check right
        			if(j < column) {
        				if(grid[i][j+1] != 1) {
        					perimeter++;
        				}
        			} 
        			else { // meaning i am the edge
        				perimeter++;
        			}
        			
        			// check bottom
        			if(i < row) {
        				if(grid[i+1][j] != 1) {
        					perimeter++;
        				}
        			} 
        			else { // meaning i am the edge
        				perimeter++;
        			}
        		}
        	}
        }
        return perimeter;
    }

}
