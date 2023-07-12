package TimeSpaceComplexity;

public class Power_logn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 3;
		 int n = 5;
	}
	public static int pow(int x,int n) {
		int ans = pow(x,n/2);
		ans = ans*ans;
		if(n%2!=0) {    // if n is odd multiply with x.
			ans*=x;
		}
		return ans;
	}

}
