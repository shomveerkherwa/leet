package problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidateSudoku {

	public static void main(String[] args) {
		// char[][] board = getValidInput();
		 char[][] board = getInValidInput();
		// char[][] board = getLeetCodeInput();
		// char[][] board = getAnotherLeetCodeInput();
		boolean isValid = validateSquares(board);
		System.out.println("isValid sudoku? "+ isValid);
	}

	private static boolean validateSquares(char[][] board) {
		Set<String> reference = new HashSet<String>();
		for(int row = 0; row<9; row++) {
			for(int column=0; column<9; column++) {
				// lets combine row+column+currentValue
				// row and column are unique per block, and if a number exists twice in the same block
				// we throw false
				char number = board[row][column];
				if (Character.isDigit(number)) {
					String combination = number+" in "+ row/3 +"*"+ column/3 + "square";
					String row_presence = number+" in row "+ row;
					String column_presence = number+" in column "+ column;
					if( !reference.add(row_presence)    ||
						!reference.add(column_presence) ||
						!reference.add(combination) ) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	private static char[][] getValidInput() {
		char[][] board = 
			{{'5','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','8','.','.','.','.','6','.'}
			,{'8','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		return board;
	}
	
	private static char[][] getInValidInput() {
		char[][] board = 
				{{'8','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'8','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};
		return board;
	}
	
	private static char[][] getLeetCodeInput() {
		char[][] board = 
			{
					{'5','3','.','.','7','.','.','.','.'},
					{'6','.','.','1','9','5','.','.','.'},
					{'.','9','8','.','.','.','.','6','.'},
					{'8','.','.','.','6','.','.','.','3'},
					{'4','.','.','8','.','3','.','.','1'},
					{'7','.','.','.','2','.','.','.','6'},
					{'.','6','.','.','.','.','2','8','.'},
					{'.','.','.','4','1','9','.','.','5'},
					{'.','.','.','.','8','.','.','7','9'}
			};
		return board;
	}
	
	private static char[][] getAnotherLeetCodeInput(){
		char[][] board = 
			{
					{'.','.','4',	'.','.','.',	'6','3','.'},
					{'.','.','.',	'.','.','.',	'.','.','.'},
					{'5','.','.',	'.','.','.',	'.','9','.'},
					
					{'.','.','.',	'5','6','.',	'.','.','.'},
					{'4','.','3',	'.','.','.',	'.','.','1'},
					{'.','.','.',	'7','.','.',	'.','.','.'},
					
					{'.','.','.',	'5','.','.',	'.','.','.'},
					{'.','.','.',	'.','.','.',	'.','.','.'},
					{'.','.','.',	'.','.','.',	'.','.','.'}
			};
		return board;
	}
}
