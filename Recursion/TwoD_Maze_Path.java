package Recursion;

public class TwoD_Maze_Path {

	public static void main(String[] args) {
		int m =3;
		int n =3;
		printPath(n-1,n-1,0,0,"");

	}
	public static void printPath(int endrow,int endcol,int currentrow,int currentcol,String ans){
		
		if(currentcol == endcol && currentrow==endrow) {
			System.out.print(ans+" ");
			return;
		}
		if(currentcol > endcol || currentrow > endrow) {
			return;
		}
		
		printPath(endrow,endcol,currentrow,currentcol+1,ans+"H");
		printPath(endrow,endcol,currentrow+1,currentcol,ans+"V");
		
	}

}
