package problems.arrays;

public class MaxSquareArea {

	public static void main(String[] args) {
		char[][] matrix = 	{
								{'1','0','1','0','0'},
								{'1','0','1','1','1'},
								{'1','1','1','1','1'},
								{'1','0','0','1','0'}
							};
		
		System.out.println(maximalSquare(matrix));
		
		}
	

	public static int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) 
			return 0;
	    int rowsMax = matrix.length;
	    int colMax = matrix[0].length;
	    int result = 0;
	    
	    int[][] aux = new int[rowsMax+1][colMax+1];
	    
	    for (int i = 1 ; i <= rowsMax; i++) {
	        for (int j = 1; j <= colMax; j++) {
	            if(matrix[i-1][j-1] == '1') {
	                aux[i][j] = Math.min(Math.min(aux[i][j-1] , aux[i-1][j-1]), aux[i-1][j]) + 1;
	                result = Math.max(aux[i][j], result); // update result
	            }
	        }
	    }
	    return result*result;
    }
}
