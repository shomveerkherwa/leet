package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		//int[][] matrix = {{1}};
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] matrix = {{1,2},{3,4}};
		for(int[] rows : matrix) {
			System.out.println(Arrays.toString(rows));
		}
		List<Integer> result = spiralOrder(matrix);
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        
        int rowBegin = 0;
        int rowEnd = row-1;
        int colBegin = 0;
        int colEnd = column-1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd) {
        	for(int j = colBegin; j <= colEnd; j++) {
        		result.add(matrix[rowBegin][j]);
        		System.out.print(matrix[rowBegin][j]+" ");
        	}
        	rowBegin++;
        	
        	for(int j = rowBegin; j <= rowEnd; j++) {
        		result.add(matrix[j][colEnd]);
        		System.out.print(matrix[j][colEnd]+" ");
        	}
        	colEnd--;
        	
        	if(rowBegin <= rowEnd) {
        		for(int j = colEnd; j >= colBegin; j--) {
            		result.add(matrix[rowEnd][j]);
            		System.out.print(matrix[rowEnd][j]+" ");
            	}
            }
        	rowEnd--;
        	
        	if(colBegin <= colEnd) {
        		for(int j = rowEnd; j >= rowBegin; j--) {
            		result.add(matrix[j][colBegin]);
            		System.out.print(matrix[j][colBegin]+" ");
            	}
            }
        	colBegin++;	
        	
        }
        return result;
    }

}
