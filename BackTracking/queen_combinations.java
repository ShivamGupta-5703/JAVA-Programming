package BackTracking;

public class queen_combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];   // by default false.
		int n =2;  // no. of queens
		Queen(board , n , 0 , "",0);
		
	}
	
	public static void Queen(boolean[] board, int tq,int qpsf,String ans,int index) {
		// tq  --> total queens
		// qpsf --> queen placed so far.
		
		if(tq == qpsf) {
			System.out.println(ans);
			return;
		}
		
		for(int i=index;i<board.length;i++) {
			
			if(board[i] == false) {   // queen placed nhi h 
				
				board[i] = true;  // queen place
				
				Queen(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf+" ",i+1);
				// answer in form --> boqo ,b1q1   etc.
				// isme hum index i+1 ki jagah i bhi bhej skte,usse koi dikkat nhi h kyuki hum i pe queen rakh ke aaye h toh agar hum i pass karenge toh if nhi chalega aur for loop next iteration pe jayega jo ki h i+1.
				//baat wahi bas iss cheez ko ignore karne ke liye hum i+1 pass kar rhe h.
				
				
				board[i] = false;   //explicit undo.   // ye execute tabhi hoga jab aur wali recursive call complete hogi.
				//This is backtracking.
				//Here,hum explicitly changes kar rhe h .
			}
		}
		
	}
}
