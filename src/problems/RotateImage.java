package problems;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = {
		                  {1,2,3},
		                  {4,5,6},
		                  {7,8,9}
						};
		
		//print first elemet of every row
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < row; column++) {
				System.out.println(matrix[row][column]);
			}
		}
		
	}
}
