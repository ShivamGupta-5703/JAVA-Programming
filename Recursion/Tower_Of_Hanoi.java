package Recursion;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;   // number of disc
		//printSteps(n,"A","B","C");
		printSteps(n,"source","helper","destination");
		

	}
	
	public static void printSteps(int n , String s, String h,String d) {
		// s --> source
		// h --> helper
		// d --> destination
		
		
		if(n==0) {
			return;
		}
		
		printSteps(n-1, s , d , h);   // moving n-1 disc from source to helper
		//here , helper is destination.
		
		System.out.println("Move "+n+"th disc move from " +s+" to "+d);
		
		printSteps(n-1,h,s,d);    // moving n-1 disc from helper to destination.
		//here ,  helper is source.
	}

}
