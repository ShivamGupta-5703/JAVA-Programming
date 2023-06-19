package Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(factorial(n));
		

	}
	public static int factorial(int n ) {
		int fn=1;
		if(n == 0) {
			return 1;
		}
//		fn = factorial(n-1);
//		return fn*n;  //head recursion
		
		return n*factorial(n-1); //head recursion
	}

}
