package problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxIncreaseToKeepCitySkyline {

	public static void main(String[] args) {
		int[][] grid = {
							{3,0,8,4},
							{2,4,5,7},
							{9,2,6,3},
							{0,3,1,0}
					   };
		System.out.println(maxIncreaseKeepingSkyline(grid));
	}

	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		
		int rowMax = grid.length;
		int colMax = grid.length;
		
		Map<Integer,Integer> rowsMaxValue = new HashMap<Integer,Integer>();
		for(int i=0; i<rowMax;i++) {
			int currMax = 0;
			for(int val : grid[i]) {
				currMax = val > currMax ? val : currMax;
			}
			rowsMaxValue.put(i, currMax);
		}
		
		Map<Integer,Integer> colsMaxValue = new HashMap<Integer,Integer>();
		for(int i=0; i<colMax;i++) { // get to different columns
			int currMax = 0;
			for(int j=0; j<rowMax; j++) { // get to different rows
				int val = grid[j][i];
				currMax = val > currMax ? val : currMax;
			}
			colsMaxValue.put(i, currMax);
			}
		
		int[][] cloned = grid.clone();
		
		//for (int i = 0; i < rowMax; i++) {
		//	for (int j = 0; j < colMax; j++) {
		//		cloned[i][j] = Math.min(rowsMaxValue.get(i), colsMaxValue.get(j));
		//	}
		//}
		
		int sum = 0;
		for (int i = 0; i < rowMax; i++) {
			for (int j = 0; j < colMax; j++) {
				sum += Math.abs((Math.min(rowsMaxValue.get(i), colsMaxValue.get(j))) - grid[i][j]);
			}
		}
		return sum;        
	}
}
