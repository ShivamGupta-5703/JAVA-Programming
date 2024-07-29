public class PascalTriangle {
	public static int factorial(int i) {
		int fact=1;
		for(int k=1;k<=i;k++) {
			fact=fact*k;
		}
		return fact;
	}


	public static void main(String[] args) {
		int n =6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(factorial(i)/((factorial(i-j))*(factorial(j))));
			}
			System.out.println();
		}
	}
}
	
//Method 2 -->
//ncr is current element while next is nc(r+1).
//so starting from ncr =1 and updating value with nc(r+1)
// formula = nc(r+1)/ncr.

//while (row < n) {
//		int i=0;
//        int ncr=1;
//   while(i<=str) (
//        System.out.print(ncr + " ");
//        ncr=((row-i)*ncr)/(i+1);
//        i++;
//	}
//    row++;
//    str++;
//   System.out.println():
//}