package TimeSpaceComplexity;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 97;
		System.out.println(isPrime1(n));
		System.out.println(isPrime2(n));

	}
	public static boolean isPrime1(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime2(int n) {
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
			
}
