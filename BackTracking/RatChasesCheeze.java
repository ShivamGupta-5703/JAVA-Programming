package BackTracking;

import java.util.Scanner;

public class RatChasesCheeze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char maze[][] = new char[n][m];
		for(int i=0;i<maze.length;i++) {
			String s = sc.next();
			for(int j=0;j<s.length();j++) {
				maze[i][j]=s.charAt(j);
			}
		}
		int ans[][] = new int[n][m];
		RatinMaze(maze,0,0,ans);
		if(flag == false) {
			System.out.println("NO PATH FOUND");
		}
		sc.close();
	}
	static boolean flag = false;
	public static void RatinMaze(char maze[][],int currentrow,int currentcol,int ans[][]) {
		//agar maze paar ho gai toh we got an answer,But last cell bhi check karna padega
		if(currentrow == maze.length -1 && currentcol == maze[0].length-1 && maze[currentrow][currentcol]!='X') {
			ans[currentrow][currentcol]=1;
			display(ans);
			flag =true;
			return;
		}
		 
		
		//base case return if currentrow and column is out of matrix or our path is blocked
		if(currentrow<0 || currentcol<0 || currentrow>=maze.length || currentcol >=maze[0].length || maze[currentrow][currentcol]=='X') {
			return ;
		}
		
		
		maze[currentrow][currentcol] = 'X';
		ans[currentrow][currentcol] = 1;
		
		int r[] = {0,0,-1,1};
		int c[] = {-1,1,0,0};
		for(int i=0;i<r.length;i++) {
			RatinMaze(maze,currentrow+r[i],currentcol+c[i],ans);
		}
		//does the same work
		
//		RatinMaze(maze,currentrow,currentcol-1,ans); //left
//		RatinMaze(maze,currentrow,currentcol+1,ans); //right
//		RatinMaze(maze,currentrow-1,currentcol,ans); //up
//		RatinMaze(maze,currentrow+1,currentcol,ans); //down
		maze[currentrow][currentcol] = 'O';
		ans[currentrow][currentcol] = 0;
	}
	public static void display(int ans[][]) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//input
//5 4
//OXOO
//OOOX
//XOXO
//XOOX
//XXOO

//output
//1 0 0 0 
//1 1 0 0 
//0 1 0 0 
//0 1 1 0 
//0 0 1 1 



