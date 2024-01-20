package revision;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		for(int[] rows : matrix) {
			System.out.println(Arrays.toString(rows));
		}
		System.out.println("---------------------------");
		rotate(matrix);
		for(int[] rows : matrix) {
			System.out.println(Arrays.toString(rows));
		}
	}
	
	// this doesnt work , change it.
	public static void rotate(int[][] matrix) {
        int rowMax = matrix.length-1;
        int colMax = matrix[0].length-1;
        
        
        for(int i=0 ; i<=rowMax; i++) {
        	 for(int j=0 ;j<=colMax;j++) {
        		int topLeft = matrix[i][j];
        		int topRight = matrix[i][rowMax-j];
        		int bottomLeft = matrix[rowMax-i][colMax-j];
        		int bottomRight = matrix[rowMax-i][j];
        		
        		matrix[i][rowMax-j] = topLeft;
        		matrix[rowMax-i][j] = topRight;
        		matrix[rowMax-i][colMax-j] = bottomLeft;
        		matrix[i][j] = bottomRight;
        	 }
        }
    }

}
