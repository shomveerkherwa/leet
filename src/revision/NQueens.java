package revision;

public class NQueens {
	public static void main(String[] args) {
		boolean [][] board = new boolean[4][4];
		int row = 0;
		int col = 0;
		int totalQueen = 4;
		int placedQueens = 0;
		placeQueens(board,row,col,totalQueen, placedQueens);
		
	}

	private static void placeQueens(boolean[][] board, int row, int col, int totalQueens, int placedQueens) {
		if(totalQueens == placedQueens) {
			printResult(board);
			return;
		}
		
		if(col == board[row].length) {
			row = row+1;
			col = 0;
		}
		
		if(row == board.length) {
			return;
		}
		
		// try placing a queen 
		if(isItSafe(board, row, col)) {
			//do
			board[row][col] = true;
			//recurr
			placeQueens(board, row, col+1, totalQueens, placedQueens+1);
			//undo
			board[row][col] = false;	
		}
		// not able to place, so increment things 
		placeQueens(board, row, col+1, totalQueens, placedQueens);
	}
	
	private static void printResult(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
		
		// vertically back, decreasing row wise
		int r = row;
		while(r >= 0) {
			if(board[r][col] == true)
				return false;
			r--;
		}
		
		//vertically back , decrasing column wise
		int c = col;
		while(c >= 0) {
			if(board[row][c] == true)
				return false;
			c--;
		}
		
		// diagnoally left, upwards 
		r = row; c = col;
		while(r >= 0 && c >= 0) {
			if(board[r][c] == true)
				return false;
			r--;c--;
		}
		
		// diagnoally right, upwards 
		r = row; c = col;
		while(r >= 0 && c < board[r].length) {
			if(board[r][c] == true)
				return false;
			r--;c++;
		}
		
		return true;
	}
}
