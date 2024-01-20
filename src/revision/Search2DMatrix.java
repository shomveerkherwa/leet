package revision;

import java.util.Arrays;

public class Search2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; int target = 3;
		for(int[] rows : matrix) {
			System.out.println(Arrays.toString(rows));
		}
		System.out.println("Does matrix contain "+target+" ? "+searchMatrix(matrix, target));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length; int column = matrix[0].length;
		int begin =0; int end = row * column -1;
		
		while(begin <= end) {
			// middle index
			int mid = (begin+end)/2;
			
			//i*column + j = index
			// i = index / column;
			// j = index % column;
			int midValue = matrix[mid/column][mid%column]; 
			if(target == midValue) {
				return true;
			}
			if(target < midValue) {
				end = mid-1;
			} else {
				begin = mid+1;
			}
		}
		
        return false;
    }

}
