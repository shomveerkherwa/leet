package revision.matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		
		char[][] board = {
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
		System.out.println(isValidSudoku(board));
		
		}
	
	
	public static boolean isValidSudoku(char[][] board) {
		Set<String> uniqueSet = new HashSet<String>();
		int row = board.length;
		int col = board[0].length;
		
		for(int i=0; i<row;i++) {
			for(int j=0; j<col;j++) {
				Character c  = board[i][j];
				if(c != '.') {
					String rowIndicator = "row"+i+c;
					String colIndicator = "col"+j+c;
					String boxIndicator = i/3 +"-"+j/3+"-"+c;
					
					if(!uniqueSet.add(rowIndicator) || !uniqueSet.add(colIndicator) || !uniqueSet.add(boxIndicator)) {
						return false;
					}
				}
			}
		}
		return true;
    }
	
	
	public boolean isValidSudoku2(char[][] board) {
        HashSet<Character> Rset = new HashSet<>(); 
        HashSet<Character> Cset = new HashSet<>(); 

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.') continue;
                else {
                    if(!Rset.add(board[i][j])) return false; 

                }
                }
            Rset = new HashSet<>(); 
            }
        

        for(int j=0;j<board.length;j++){
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='.')continue;
                    else{
                    if(!Cset.add(board[i][j])) return false; 
                    }
            }
            Cset = new HashSet<>(); 

        }
        

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!check3(i,j,board)) return false;
            }
        }
        
        return true;
        }
    
    public boolean check3(int i,int j,char[][] board){
        HashSet<Character> set3 = new HashSet<>();
        for(int m=i;m<3+i;m++){
            for(int n=j;n<3+j;n++){
                if(board[m][n]=='.') continue;
                else {
                    if(!set3.add(board[m][n])) return false;
                }
            }
        }
        return true;
    }
}
