// Leetcode 79
package BackTracking;

public class Word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char maze[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				if(word.charAt(0)==maze[i][j]) {   //agar pehla character tabhi recursive call lage,nhi toh pehle first word hi search karo.
					boolean ans = WordSearch(maze,i,j,word,0);
					if(ans){
						System.out.println(ans);
						//return true;
					}
				}
			}
		}
		//System.out.println(false);
		//return false;
	}
	public static boolean WordSearch(char maze[][],int currentrow,int currentcol,String word,int index) {
		if(index == word.length()) {
			return true;   //poora word doond liya h
		}
		
		//agar maze paar ho gai ya character at index is not equal to required character we return false.
		//word.charAt(index)!=maze[currentrow][currentcol]   blocked aur mismatch dono issi se check hoga kyuki humne usko * bana diya kabhi match hi nhi hoga
		if(currentrow<0 || currentcol<0 || currentrow >= maze.length  || currentcol >= maze[0].length || word.charAt(index)!=maze[currentrow][currentcol]){
			return false;
		}
		
		//blocked
		maze[currentrow][currentcol] = '*';
		
		//like rat in maze, row col array bana leinge jese move krna h
		// up,down,left,right [see row and corresponding column]
		int r[] = {-1,1,0,0};
		int c[] = {0,0,-1,1};
		
		for(int i=0;i<c.length;i++) {
			boolean ans = WordSearch(maze,currentrow +r[i],currentcol + c[i],word,index+1);
			if(ans) {
				return true;   //agar answer mil gaya kahi bhi mil gya toh return true
			}
		}
		//unblock
		maze[currentrow][currentcol] = word.charAt(index);
		
		return false; //ans not found
	}

}
