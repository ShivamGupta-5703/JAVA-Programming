package Recursion;

public class Factorial2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(factorial(n,1));

	}

	public static int factorial(int n, int ans) {
		int fn = 1;
		if (n == 0) {
			return ans;
		}
		return factorial(n - 1, ans * n); // tail recursion
	}
}
