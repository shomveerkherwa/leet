package revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

	public static void main(String[] args) {
		//int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		int[][] matrix = {{1,1,1},{1,1,1},{1,1,1}};
		for(int[] rows : matrix) {
			System.out.println(Arrays.toString(rows));
		}
		System.out.println("---------------------------");
		setZeroes(matrix);
		for(int[] rows : matrix) {
			System.out.println(Arrays.toString(rows));
		}
	}
	
	public static void setZeroes(int[][] matrix) {
	   Set<Integer>rowWithZero = new HashSet<>();
	   Set<Integer>columnsWithZero = new HashSet<>();
	   int row = matrix.length;
	   int column = matrix[0].length;
	   
	   for(int i=0; i<row; i++) {
		   for(int j=0; j<column;j++) {
			   if(matrix[i][j] == 0) {
				   rowWithZero.add(i);
		   		   columnsWithZero.add(j);	
		      }
			}
	   }
	   
	   for(int i=0; i<row; i++) {
		   if(rowWithZero.contains(i)) {
			   for(int currentColumn = 0; currentColumn < column; currentColumn++)
				   matrix[i][currentColumn]=0;
		   }
		   for(int j=0; j<column;j++) {
			   if(columnsWithZero.contains(j)) {
				   for(int currentRow = 0; currentRow < row; currentRow++)
					   matrix[currentRow][j]=0;
			   }
			}
	   }
	}
}
