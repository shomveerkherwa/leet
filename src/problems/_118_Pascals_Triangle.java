package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
*/

/*
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
	
public class _118_Pascals_Triangle {

	public static void main(String[] args) {
		List<List<Integer>> triangle = generate(5);
		for(List<Integer> row : triangle) {
			System.out.println(row.toString());
		}
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		if(numRows == 0) // if no row are requested, return empty triangle.
			return triangle;
		
		// initiate the first row, and add it to triangle 
		List<Integer> first_row = new ArrayList<Integer>();
		first_row.add(1);
		triangle.add(first_row);
		
		for (int i = 1; i < numRows; i++) {
			List<Integer> previous_row = triangle.get(i-1); // because we have already added first_row at 0th index
			List<Integer> current_row = new ArrayList<Integer>();
			current_row.add(1); // because first and last elemet of every row is 1;
			for (int j = 1; j < i; j++) // because with every iteration , the number of elements in that row are equal
										// to i (iteration value)
			{
				current_row.add(previous_row.get(j) + previous_row.get(j - 1));
			}
			current_row.add(1); // because first and last elemet of every row is 1;
			triangle.add(current_row);
		}
		
		// return the completed triangle
		return triangle;
	}
}
