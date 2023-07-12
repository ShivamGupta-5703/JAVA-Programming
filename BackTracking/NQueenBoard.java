package BackTracking;

public class NQueenBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		boolean board[][] = new boolean[n][n];   //initially false [by default].
		Nqueen(board,0,n);
	}
	public static void Nqueen(boolean board[][],int row,int totalqueen){
		if(totalqueen==0) {      //base case
			display(board);
			System.out.println();
			return;
		}
		
		for(int col=0;col<board.length;col++) {
			if(isitSafe(board,row,col)) {
				board[row][col]=true;
				Nqueen(board,row+1,totalqueen-1);
				board[row][col]=false;
			}
		}
	}
	public static boolean isitSafe(boolean board[][],int row,int col) {
		//upper
		int r = row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
		}
		//left side diagonal
		r = row;
		int c = col;
		while(r>=0 && c>=0){
			if(board[r][c]==true) {
				return false;
			}
			r--;c--;
		}
		//right side diagonal
		r = row;
		c = col;
		while(r>=0 && c<board.length){
			if(board[r][c]==true) {
				return false;
			}
			r--;c++;
		}
		
		return true;
	}
	
	public static void display(boolean board[][]) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
