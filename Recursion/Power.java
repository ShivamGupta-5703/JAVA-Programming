<<<<<<< HEAD
package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b=5;
		System.out.println(power(a,b));

	}
	public static int power(int a,int b) {
		
		if(b==0) {
			return 1;
		}
		
		int ans = power(a,b-1);
		
		return ans*a;
	}

}
=======
package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b=5;
		System.out.println(power(a,b));

	}
	public static int power(int a,int b) {
		
		if(b==0) {
			return 1;
		}
		
		int ans = power(a,b-1);
		
		return ans*a;
	}

}
>>>>>>> 9265cfa644a9e9f746adec26738ce8d105dde8ba
