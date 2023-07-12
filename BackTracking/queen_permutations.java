package BackTracking;

public class queen_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];   // by default false.
		int n =2;  // no. of queens
		Queen(board , n , 0 , "");
		
	}
	
	public static void Queen(boolean[] board, int tq,int qpsf,String ans) {
		// tq  --> total queens
		// qpsf --> queen placed so far.
		
		if(tq == qpsf) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<board.length;i++) {
			
			if(board[i] == false) {   // queen placed nhi h 
				
				board[i] = true;  // queen place
				
				Queen(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf+" ");
				// answer in form --> boqo ,b1q1   etc.
				//strings are immutable.hAr call me ans + ... wali string nai location pe banegi.
				
				
				board[i] = false;   //explicit undo.   // ye execute tabhi hoga jab aur wali recursive call complete hogi.
				//This is backtracking.
				//Here,hum explicitly changes kar rhe h .
			}
		}
		
	}

}
