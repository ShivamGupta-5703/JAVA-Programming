package Recursion;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		System.out.println(fibonacci(n));

	}
	public static int fibonacci(int n) {
		if(n==0 || n==1 ) {
			return n;
		}
		int f1= fibonacci(n-1);
		int f2 = fibonacci(n-2);
		return f1+f2;
	}

}
